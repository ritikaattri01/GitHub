package com.app.github.data.repository

import com.app.github.core.common.Resource
import com.app.github.core.extensions.data
import com.app.github.core.extensions.safeApiCall
import com.app.github.data.remote.PullRequestApi
import com.app.github.data.remote.dto.PullRequestDto
import com.app.github.domain.api_param_model.PullRequestParam
import com.app.github.domain.mapper.PullRequestMapper.mapToDomain
import com.app.github.domain.model.PullRequest
import com.app.github.domain.repository.IPullRequestRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Response
import javax.inject.Inject

class PullRequestRepository @Inject constructor(
    private val pullRequestApi: PullRequestApi,
) : IPullRequestRepository {

    override suspend fun fetchPullRequests(
        param: PullRequestParam
    ): Flow<Resource<List<PullRequest>>> = flow {

        emit(Resource.Loading(isLoading = true))

        safeApiCall(block = {
            val response: Response<List<PullRequestDto>> = param.run {
                pullRequestApi.fetchPullRequests(
                    userId, repoName, status.status, perPage, pageNo
                )
            }

            emit(response.data { it.mapToDomain })
        }, error = {
            emit(Resource.Error(it))
        })

        emit(Resource.Loading(isLoading = false))
    }
}