package com.app.github.core.extensions

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.loadImage(imageUrl: String) {
    Glide
        .with(this.context)
        .load(imageUrl)
        .centerCrop()
        .into(this);
}