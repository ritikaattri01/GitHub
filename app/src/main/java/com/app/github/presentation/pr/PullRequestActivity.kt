package com.app.github.presentation.pr

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.github.R
import com.app.github.core.common.Resource
import com.app.github.core.extensions.isFirstPage
import com.app.github.core.extensions.showErrorMessage
import com.app.github.core.extensions.showIf
import com.app.github.core.recycler_view.InfiniteScrollListener
import com.app.github.databinding.ActivityPullRequestBinding
import com.app.github.domain.api_param_model.PullRequestParam
import com.app.github.domain.model.PullRequest
import com.app.github.presentation.adapter.PullRequestRvAdapter
import com.app.github.presentation.adapter.factory.ItemTypeFactory
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class PullRequestActivity : AppCompatActivity() {

    private val viewModel: PullRequestViewModel by viewModels()
    private var _binding: ActivityPullRequestBinding? = null
    private val adapter = PullRequestRvAdapter(ItemTypeFactory())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityPullRequestBinding.inflate(layoutInflater).apply {
            setContentView(this.root)
        }

        initActionbar()
        initRecyclerView()
        observeLiveData()
        loadData()
    }

    private fun initActionbar() = supportActionBar?.apply {
        title = resources.getString(R.string.pull_request)
    }

    private fun initRecyclerView() {
        val layoutManager = LinearLayoutManager(this)
        _binding?.recyclerView?.apply {
            this.layoutManager = layoutManager
            adapter = this@PullRequestActivity.adapter
            addOnScrollListener(object : InfiniteScrollListener(layoutManager) {
                override fun onLoadMore() {
                    this@PullRequestActivity.adapter.addLoadingState()
                    fetchPullRequest(isInitialLoad = false)
                }

                override fun isDataLoading(): Boolean {
                    val state = viewModel.pullRequestLiveData.value as? Resource.Loading
                    return state?.isLoading == true
                }
            })
        }
    }

    private fun fetchPullRequest(isInitialLoad: Boolean = false) {
        viewModel.fetchPullRequest(PullRequestParam(isInitialLoading = isInitialLoad))
    }

    private fun loadData() {
        fetchPullRequest(isInitialLoad = true)
    }

    private fun observeLiveData() {
        viewModel.pullRequestLiveData.observe(this) {
            when (it) {
                is Resource.Error -> showErrorMessage(it.message.asString(this))
                is Resource.Loading -> updateLoadingState(it.isLoading)
                is Resource.Success -> onSuccessList(it.data)
            }
        }
    }

    private fun onSuccessList(list: List<PullRequest>) {
        adapter.submitList(list)
    }

    private fun updateLoadingState(isLoading: Boolean) {
        if (viewModel.pageNo.isFirstPage)
            _binding?.progressBarRoot?.progressBar?.showIf(isLoading)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
        viewModel.pullRequestLiveData.removeObservers(this)
    }

    companion object {
        fun Activity.navigateToPullRequestActivity() {
            val source = this
            val destination = PullRequestActivity::class.java

            source.startActivity(
                Intent(
                    source, destination
                )
            )
        }
    }
}