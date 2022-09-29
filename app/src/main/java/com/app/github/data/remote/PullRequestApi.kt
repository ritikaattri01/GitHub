package com.app.github.data.remote

import com.app.github.data.remote.dto.PullRequestDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PullRequestApi {

    @GET("repos/{$USER_ID}/{$REPO_NAME}/pulls")
    suspend fun fetchPullRequests(
        @Path(USER_ID) userId: String,
        @Path(REPO_NAME) repository: String,
        @Query(STATUS) status: String,
        @Query(PER_PAGE) perPage: Int,
        @Query(PAGE) pageNo: Int,
    ): Response<List<PullRequestDto>>

    private companion object {
        const val USER_ID = "user_id"
        const val REPO_NAME = "repo_name"
        const val STATUS = "state"
        const val PER_PAGE = "per_page"
        const val PAGE = "page"
    }
}