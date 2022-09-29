package com.app.github.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.app.github.domain.model.Loading
import com.app.github.presentation.adapter.base.AbstractViewHolder
import com.app.github.presentation.adapter.base.BaseItemModel
import com.app.github.presentation.adapter.factory.ItemTypeFactory

class PullRequestRvAdapter(
    private val adapterTypeFactory: ItemTypeFactory,
) : ListAdapter<BaseItemModel, AbstractViewHolder<BaseItemModel>>(PullRequestAdapterDiffUtil) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): AbstractViewHolder<BaseItemModel> {
        val layoutInflater = LayoutInflater.from(parent.context)
        return adapterTypeFactory.createViewHolder(
            layoutInflater, parent, viewType
        ) as AbstractViewHolder<BaseItemModel>
    }

    override fun onBindViewHolder(holder: AbstractViewHolder<BaseItemModel>, position: Int) {
        holder.bind(getItem(position))
    }

    override fun getItemViewType(position: Int): Int {
        return getItem(position).type(adapterTypeFactory)
    }

    fun addLoadingState() {
        val newList = currentList.toMutableList().also {
            it.add(Loading)
        }
        submitList(newList)
    }
}