package com.app.github.domain.model

import com.app.github.core.common.DateTime
import com.app.github.presentation.adapter.base.BaseItemModel
import com.app.github.presentation.adapter.factory.ItemTypeFactory

data class PullRequest(
    val title: String = "",
    val createdAt: DateTime = DateTime.Default,
    val closedAt: DateTime = DateTime.Default,
    val user: User = User(),
) : BaseItemModel {
    data class User(
        val avatarUrl: String = "",
        val name: String = "",
    )

    override fun type(typeFactory: ItemTypeFactory): Int {
        return typeFactory.type(this)
    }

}