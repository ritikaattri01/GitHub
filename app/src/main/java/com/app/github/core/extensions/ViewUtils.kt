package com.app.github.core.extensions

import android.content.Context
import android.text.Html
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.StringRes

fun View.show() {
    visibility = View.VISIBLE
}

fun View.hide() {
    visibility = View.GONE
}

fun View.showIf(it: Boolean) {
    if (it) show() else hide()
}

fun Context.showErrorMessage(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun TextView.attributedText(@StringRes id: Int, vararg args: Any) {
    text = Html.fromHtml(
        String.format(
            resources.getString(id), *args
        )
    )
}