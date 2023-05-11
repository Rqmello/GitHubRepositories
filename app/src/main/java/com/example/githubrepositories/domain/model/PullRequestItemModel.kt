package com.example.githubrepositories.domain.model

data class PullRequestItemModel(
    val title: String,
    val usuario: UserModel,
    val body: String,
    val created_at: String,
)