package com.app.github.presentation.adapter.viewholder

import android.view.LayoutInflater
import android.view.ViewGroup
import com.app.github.R
import com.app.github.core.extensions.attributedText
import com.app.github.core.extensions.loadImage
import com.app.github.databinding.RvPullRequestBinding
import com.app.github.domain.model.PullRequest
import com.app.github.presentation.adapter.base.AbstractViewHolder

class PullRequestViewHolder(
    private val binding: RvPullRequestBinding
) : AbstractViewHolder<PullRequest>(binding.root) {

    override fun bind(element: PullRequest) = with(binding) {
        title.attributedText(R.string.title_s, element.title)
        createdAt.attributedText(
            R.string.created_at_s,
            element.createdAt.date, element.createdAt.time
        )
        closedAt.attributedText(
            R.string.closed_at_s,
            element.closedAt.date, element.closedAt.time
        )
        userName.attributedText(R.string.userid_s, element.user.name)
        userImage.loadImage(element.user.avatarUrl)
    }

    companion object {
        val LAYOUT = R.layout.rv_pull_request

        fun create(
            layoutInflater: LayoutInflater, parent: ViewGroup
        ): PullRequestViewHolder {
            return PullRequestViewHolder(
                RvPullRequestBinding.inflate(layoutInflater, parent, false)
            )
        }
    }
}