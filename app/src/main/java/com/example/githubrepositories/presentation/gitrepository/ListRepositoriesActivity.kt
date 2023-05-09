package com.example.githubrepositories.presentation.gitrepository

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.githubrepositories.databinding.ActivityRepositoryListBinding

class ListRepositoriesActivity : AppCompatActivity(){

    private var _binding: ActivityRepositoryListBinding? = null

    private val binding get() = _binding!!

    private val viewModel: RepositoriesViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityRepositoryListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.resultLiveData.observe(this@ListRepositoriesActivity) {
            binding.rvRepositories.adapter = RepositoriesAdapter(it)
        }

        viewModel.getAllRepositories( String, 1)
    }

}