package com.app.github.presentation.adapter.factory

import android.view.LayoutInflater
import android.view.ViewGroup
import com.app.github.domain.model.Loading
import com.app.github.domain.model.PullRequest
import com.app.github.presentation.adapter.base.AbstractViewHolder
import com.app.github.presentation.adapter.viewholder.LoadingViewHolder
import com.app.github.presentation.adapter.viewholder.PullRequestViewHolder

class ItemTypeFactory {

    fun type(element: PullRequest) = PullRequestViewHolder.LAYOUT
    fun type(element: Loading) = LoadingViewHolder.LAYOUT

    fun createViewHolder(
        layoutInflater: LayoutInflater, parent: ViewGroup, type: Int
    ): AbstractViewHolder<*> {
        return when (type) {
            PullRequestViewHolder.LAYOUT -> PullRequestViewHolder.create(layoutInflater, parent)
            LoadingViewHolder.LAYOUT -> LoadingViewHolder.create(layoutInflater, parent)
            else -> createViewHolder(layoutInflater, parent, type)
        }
    }
}