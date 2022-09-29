package com.app.github.di

import com.app.github.core.extensions.buildApi
import com.app.github.data.remote.PullRequestApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {

    @Provides
    @Singleton
    fun providePRApi(): PullRequestApi = buildApi()
}