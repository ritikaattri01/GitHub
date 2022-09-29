package com.app.github.domain.repository

import com.app.github.core.common.Resource
import com.app.github.domain.api_param_model.PullRequestParam
import com.app.github.domain.model.PullRequest
import kotlinx.coroutines.flow.Flow

interface IPullRequestRepository {

    suspend fun fetchPullRequests(param: PullRequestParam): Flow<Resource<List<PullRequest>>>
}