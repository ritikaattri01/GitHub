package com.app.github.presentation.adapter.base

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class AbstractViewHolder<in T : BaseItemModel>(
    root: View
) : RecyclerView.ViewHolder(root) {
    abstract fun bind(element: T)
}