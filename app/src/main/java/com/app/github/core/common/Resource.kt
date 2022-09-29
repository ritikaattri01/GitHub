package com.app.github.core.common

sealed class Resource<T> {
    data class Success<T>(val data: T) : Resource<T>()
    data class Error<T>(val message: StringHandler) : Resource<T>()
    data class Loading<T>(val isLoading: Boolean) : Resource<T>()
}