package com.app.github.core.extensions

import android.util.Log
import com.app.github.R
import com.app.github.core.common.Resource
import com.app.github.core.common.RetrofitErrorMessage
import com.app.github.core.common.StringHandler
import com.google.gson.Gson
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.HttpException
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import java.io.IOException
import java.net.SocketTimeoutException


inline fun <reified T> buildApi(
    baseUrl: String = "https://api.github.com/"
): T {

    val loggingInterceptor = HttpLoggingInterceptor().apply {
        setLevel(HttpLoggingInterceptor.Level.BODY)
    }
    val headerInterceptor = Interceptor { chain ->
        val builder = chain.request().newBuilder()
        builder.header("Time-Zone", "Asia/Kolkata")
        return@Interceptor chain.proceed(builder.build())
    }

    val okHttpClient = OkHttpClient.Builder().apply {
        addInterceptor(headerInterceptor)
        addInterceptor(loggingInterceptor)
    }.build()

    return Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(
            GsonConverterFactory.create()
        )
        .client(okHttpClient)
        .build()
        .create()
}

suspend inline fun safeApiCall(
    block: suspend () -> Unit,
    error: (StringHandler) -> Unit,
) {
    try {
        block.invoke()
    } catch (e: Exception) {
        e.printStackTrace()
        Log.d("Github", "safeApiCall: ${e.localizedMessage}")
        error.invoke(
            StringHandler.ResourceString(
                when (e) {
                    is SocketTimeoutException -> R.string.slow_internet
                    is HttpException -> R.string.an_unexpected_error_occurred
                    is IOException -> R.string.check_your_internet_connection
                    else -> R.string.something_went_wrong
                }
            )
        )
    }
}

fun <T> Response<T>.errorMessage(): StringHandler {
    val data = Gson().fromJson(
        this@errorMessage.errorBody()?.charStream(), RetrofitErrorMessage::class.java
    )
    return StringHandler.NormalString(data.message)
}

inline fun <T_Response, T_Success> Response<T_Response>.data(
    transformSuccess: (T_Response) -> T_Success,
): Resource<T_Success> {
    val response = this
    val body = response.body()

    return if (response.isSuccessful && body != null) {
        Resource.Success(transformSuccess(body))
    } else {
        Resource.Error(response.errorMessage())
    }
}