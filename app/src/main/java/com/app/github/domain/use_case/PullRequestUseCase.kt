package com.app.github.domain.use_case

import com.app.github.core.common.Resource
import com.app.github.domain.api_param_model.PullRequestParam
import com.app.github.domain.model.PullRequest
import com.app.github.domain.repository.IPullRequestRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class PullRequestUseCase @Inject constructor(
    private val repository: IPullRequestRepository,
) {

    suspend fun fetchPullRequests(param: PullRequestParam): Flow<Resource<List<PullRequest>>> {
        return repository.fetchPullRequests(param)
    }
}