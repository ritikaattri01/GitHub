package com.app.github.di

import com.app.github.data.repository.PullRequestRepository
import com.app.github.domain.repository.IPullRequestRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun providePRRepo(repo: PullRequestRepository): IPullRequestRepository
}