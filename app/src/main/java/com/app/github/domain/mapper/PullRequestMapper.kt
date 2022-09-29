package com.app.github.domain.mapper


import com.app.github.data.remote.dto.PullRequestDto
import com.app.github.domain.model.PullRequest
import com.app.github.core.extensions.orBlank
import com.app.github.core.extensions.splitDateTime

object PullRequestMapper {

    val List<PullRequestDto>.mapToDomain
        get() = map { it.mapToDomain }

    val PullRequestDto.mapToDomain
        get() = PullRequest(
            title = title.orBlank,
            closedAt = closedAt.splitDateTime(),
            createdAt = createdAt.splitDateTime(),
            user = (user ?: PullRequestDto.User()).mapToDomain
        )

    val PullRequestDto.User.mapToDomain
        get() = PullRequest.User(avatarUrl.orBlank, name = login.orBlank)
}