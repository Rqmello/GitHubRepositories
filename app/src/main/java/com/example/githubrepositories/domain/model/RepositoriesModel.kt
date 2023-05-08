package com.example.githubrepositories.domain.model

data class RepositoriesModel(
    val total_count: Int,
    val items: List<Item>
)

data class Item(
    val name: String,
    val full_name: String,
    val userModel: UserModel,
    val html_url: String,
    val description: String,
    val stargazers_count: Int,
    val forks_count: Int,
    val forks: Int,
)

data class UserModel(
    val login: String,
    val id: Int,
    val avatar_url: String
)