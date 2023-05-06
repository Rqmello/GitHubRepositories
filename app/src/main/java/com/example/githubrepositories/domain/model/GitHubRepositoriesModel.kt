package com.example.githubrepositories.domain.model

data class GitHubRepositoriesModel(
    val total_count: Int,
    val items: List<Item>
)

data class Item(
    val name: String,
    val full_name: String,
    val owner: Owner,
    val html_url: String,
    val description: String,
    val stargazers_count: Int,
    val forks_count: Int,
    val forks: Int,
)

data class Owner(
    val login: String,
    val id: Int,
    val avatar_url: String
)