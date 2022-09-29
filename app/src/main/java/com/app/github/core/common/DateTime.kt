package com.app.github.core.common

data class DateTime(
    val date: String = "",
    val time: String = "",
) {
    companion object {
        val Default = DateTime()
    }
}
