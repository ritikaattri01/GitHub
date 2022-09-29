package com.app.github.utils.constants

enum class PullRequestStatus(val status: String) {
    All("all"),
    Open("open"),
    Closed("closed"),
    Default(Closed.status),
}