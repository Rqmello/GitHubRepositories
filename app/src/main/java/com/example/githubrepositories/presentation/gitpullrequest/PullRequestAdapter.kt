package com.example.githubrepositories.presentation.gitpullrequest

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.githubrepositories.databinding.ItemPullRequestBinding
import com.example.githubrepositories.domain.model.PullRequestItemModel

class PullRequestAdapter(private var list: List<PullRequestItemModel?>) :
    RecyclerView.Adapter<PullRequestAdapter.PullRequestViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PullRequestAdapter.PullRequestViewHolder {
        val binding = ItemPullRequestBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PullRequestViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PullRequestViewHolder, position: Int) {
        val reposit = list[position]
        if (reposit != null) {
            holder.encaixar(reposit)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class PullRequestViewHolder(private val binding: ItemPullRequestBinding) : RecyclerView.ViewHolder(binding.root) {

        fun encaixar(item: PullRequestItemModel) {
            binding.tvGitHubRepositoriesItemPullRequestDate.text = "Criado em: " + item.created_at
            binding.tvGitHubRepositoriesItemPullRequestBody.text = item.body
            binding.tvGitHubRepositoriesItemPullRequestUsername.text = item.usuario.login
            binding.tvGitHubRepositoriesItemPullRequestTitle.text = item.title
            Glide.with(binding.ivGitHubRepositoriesItemPullRequestAvatarUrl)
                .load(item.usuario.avatarUrl)
                .into(binding.ivGitHubRepositoriesItemPullRequestAvatarUrl)
            binding.clItemPullRequest.setOnClickListener {
                val openURL = Intent(android.content.Intent.ACTION_VIEW)
                openURL.data = Uri.parse(item.htmlUrl)
                startActivityPR(openURL)
            }
        }
            fun startActivityPR(intent: Intent) {
                binding.root.context.startActivity(intent)
            }
        }
    }