package com.app.github.core.extensions

import com.app.github.utils.constants.DefaultValues


val String?.orBlank get() = this ?: ""

val Int.isFirstPage get() = this == DefaultValues.PAGE_NO