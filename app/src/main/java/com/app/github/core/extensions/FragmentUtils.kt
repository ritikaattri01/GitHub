package com.app.github.core.extensions

import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

val Fragment.mName: String get() = this.javaClass.canonicalName ?: this.javaClass.simpleName

fun FragmentActivity.addFragment(
    @IdRes containerViewId: Int,
    fragment: Fragment,
) {
    changeFragment(containerViewId, fragment, true)
}

fun FragmentActivity.replaceFragment(
    @IdRes containerViewId: Int,
    fragment: Fragment,
) {
    changeFragment(containerViewId, fragment, false)
}

private fun FragmentActivity.changeFragment(
    @IdRes containerViewId: Int,
    fragment: Fragment,
    isAdd: Boolean,
    addToBackStack: Boolean = false,
) {
    val transaction = supportFragmentManager.beginTransaction()
    if (isAdd) {
        transaction.add(containerViewId, fragment)
    } else {
        transaction.replace(containerViewId, fragment)
    }
    if (addToBackStack)
        transaction.addToBackStack(fragment.mName)
    transaction.commit()
}