package com.app.github.domain.model

import com.app.github.presentation.adapter.base.BaseItemModel
import com.app.github.presentation.adapter.factory.ItemTypeFactory

object Loading : BaseItemModel {
    override fun type(typeFactory: ItemTypeFactory): Int {
        return typeFactory.type(this)
    }
}