package com.app.github.presentation.adapter.base

import com.app.github.presentation.adapter.factory.ItemTypeFactory

interface BaseItemModel {
    fun type(typeFactory: ItemTypeFactory): Int
}