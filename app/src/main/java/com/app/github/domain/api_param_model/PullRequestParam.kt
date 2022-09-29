package com.app.github.domain.api_param_model

import com.app.github.utils.constants.DefaultValues
import com.app.github.utils.constants.PullRequestStatus

data class PullRequestParam(
    val userId: String = DefaultValues.USER_ID,
    val repoName: String = DefaultValues.REPO_NAME,
    val status: PullRequestStatus = PullRequestStatus.Default,
    val perPage: Int = DefaultValues.PER_PAGE,
    val pageNo: Int = 0,
    val isInitialLoading: Boolean = false
)
