package com.example.githubrepositories.presentation.gitpullrequest

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.githubrepositories.databinding.ActivityPullRequestListBinding

class ListPullRequestActivity : AppCompatActivity() {

    private var _binding: ActivityPullRequestListBinding? = null

    private val binding get() = _binding!!

    private val viewModel: PullRequestViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityPullRequestListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel.resultLiveData.observe(this@ListPullRequestActivity) {
             binding.rvPullRequest.adapter = PullRequestAdapter(it)

        }
        val pullrequest = intent.extras?.getString("pullReq")
        if (pullrequest != null) {
            viewModel.getAllPullRequestOfRepository(criador = String, test = String)
        }
    }
}