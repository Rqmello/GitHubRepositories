package com.example.githubrepositories.domain.model

data class RepositoriesModel(
    val total_count: Int,
    val items: List<ItemModel>
)

data class ItemModel(
    val name: String,
    val fullName: String,
    val userModel: UserModel,
    val htmlUrl: String,
    val description: String?,
    val stargazersCount: Int,
    val forksCount: Int,
    val forks: Int,
)

data class UserModel(
    val login: String,
    val id: Int,
    val avatarUrl: String
)