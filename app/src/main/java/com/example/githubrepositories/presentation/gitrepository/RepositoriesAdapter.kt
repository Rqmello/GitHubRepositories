package com.example.githubrepositories.presentation.gitrepository

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.githubrepositories.databinding.ItemRepositoryBinding
import com.example.githubrepositories.domain.model.ItemModel

class RepositoriesAdapter(private var list: List<ItemModel>) :
    RecyclerView.Adapter<RepositoriesAdapter.RepositoriesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepositoriesAdapter.RepositoriesViewHolder {
        val binding = ItemRepositoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RepositoriesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RepositoriesViewHolder, position: Int) {
        val reposit = list[position]
        holder.org(reposit)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class RepositoriesViewHolder(private val binding: ItemRepositoryBinding) : RecyclerView.ViewHolder(binding.root) {

        fun org(item: ItemModel) {
            binding.tvGitHubRepositoriesItemName.text = item.name
            binding.tvGitHubRepositoriesItemFullName.text = item.fullName
            binding.tvGitHubRepositoriesItemDescripton.text = "Descrição   " + item.description
            binding.tvGitHubRepositoriesItemStargazersCount.text = item.stargazersCount.toString()
            binding.tvGitHubRepositoriesItemForksCount.text = item.forks.toString()
            binding.tvGitHubRepositoriesItemLogin.text = item.userModel.login
            binding.tvGitHubRepositoriesItemHtmlUrl.text = item.htmlUrl
            binding.tvGitHubRepositoriesItemId.text = item.userModel.id.toString()
            Glide.with(binding.ivGitHubRepositoriesItemAvatar)
                .load(item.userModel.avatarUrl)
                .into(binding.ivGitHubRepositoriesItemAvatar)

        }
    }

}