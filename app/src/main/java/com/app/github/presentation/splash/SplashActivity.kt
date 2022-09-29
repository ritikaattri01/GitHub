package com.app.github.presentation.splash

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.app.github.R
import com.app.github.presentation.pr.PullRequestActivity.Companion.navigateToPullRequestActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        supportActionBar?.hide()
    }

    override fun onStart() {
        super.onStart()
        navigateToPullRequest()
    }

    private fun navigateToPullRequest() {
        lifecycleScope.launch {
            delay(SPLASH_DELAY)
            navigateToPullRequestActivity()
            finish()
        }
    }

    private companion object {
        const val SPLASH_DELAY = 1000L
    }
}