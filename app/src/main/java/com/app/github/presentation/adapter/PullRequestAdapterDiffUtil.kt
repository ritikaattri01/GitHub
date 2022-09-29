package com.app.github.presentation.adapter

import androidx.recyclerview.widget.DiffUtil
import com.app.github.domain.model.PullRequest
import com.app.github.presentation.adapter.base.BaseItemModel

object PullRequestAdapterDiffUtil : DiffUtil.ItemCallback<BaseItemModel>() {
    override fun areItemsTheSame(oldItem: BaseItemModel, newItem: BaseItemModel): Boolean {
        return when {
            oldItem is PullRequest && newItem is PullRequest -> oldItem === newItem
            else -> false
        }
    }

    override fun areContentsTheSame(oldItem: BaseItemModel, newItem: BaseItemModel): Boolean {
        return when {
            oldItem is PullRequest && newItem is PullRequest -> oldItem == newItem
            else -> false
        }
    }
}