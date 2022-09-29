package com.app.github.presentation.adapter.viewholder

import android.view.LayoutInflater
import android.view.ViewGroup
import com.app.github.R
import com.app.github.databinding.ProgressBarBinding
import com.app.github.domain.model.Loading
import com.app.github.presentation.adapter.base.AbstractViewHolder

class LoadingViewHolder(
    private val binding: ProgressBarBinding
) : AbstractViewHolder<Loading>(binding.root) {

    override fun bind(element: Loading) {

    }

    companion object {
        val LAYOUT = R.layout.progress_bar

        fun create(
            layoutInflater: LayoutInflater, parent: ViewGroup
        ): LoadingViewHolder {
            return LoadingViewHolder(
                ProgressBarBinding.inflate(layoutInflater, parent, false)
            )
        }
    }
}