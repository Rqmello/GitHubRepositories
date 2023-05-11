package com.example.githubrepositories.presentation.gitrepository

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.githubrepositories.databinding.ActivityRepositoryListBinding

class ListRepositoriesActivity : AppCompatActivity() {

    private var _binding: ActivityRepositoryListBinding? = null

    private val binding get() = _binding!!

    private val viewModel: RepositoriesViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityRepositoryListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel.resultLiveData.observe(this@ListRepositoriesActivity) {
            binding.rvRepositories.adapter = RepositoriesAdapter(it.items)
            binding.tvGitHubRepositoriesItemTotalCount.text = "Total de Repositórios: " + it.total_count.toString()
        }

        val linguagem = intent.extras?.getString("lang")
        if (linguagem != null) {
            viewModel.getAllRepositories(ling = linguagem, pag = 1)
        }

        binding.tvRepositoryListPage.text = "1"
        var pageActual: Int
        binding.ibGitHubRepositoriesItemPrevious.isVisible = false

        binding.ibGitHubRepositoriesItemNext.setOnClickListener {
            pageActual = binding.tvRepositoryListPage.text.toString().toInt() + 1
            binding.tvRepositoryListPage.text = pageActual.toString()
            if (linguagem != null) {
                viewModel.getAllRepositories(ling = linguagem, pag = pageActual)
                binding.ibGitHubRepositoriesItemPrevious.isVisible = true
            }
        }
        binding.ibGitHubRepositoriesItemPrevious.setOnClickListener {
            pageActual = binding.tvRepositoryListPage.text.toString().toInt() - 1
            binding.tvRepositoryListPage.text = pageActual.toString()
            if (linguagem != null) {
                viewModel.getAllRepositories(ling = linguagem, pag = pageActual)
                binding.ibGitHubRepositoriesItemPrevious.isVisible = pageActual > 1
            }
        }
    }
}
