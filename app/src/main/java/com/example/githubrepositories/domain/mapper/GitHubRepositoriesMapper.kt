package com.example.githubrepositories.domain.mapper

import com.example.githubrepositories.data.remote.response.GitHubRepositoriesResponse
import com.example.githubrepositories.domain.model.GitHubRepositoriesModel
import com.example.githubrepositories.domain.model.Item
import com.example.githubrepositories.domain.model.UserModel

fun GitHubRepositoriesResponse.toModel(): GitHubRepositoriesModel {
    return GitHubRepositoriesModel(
        total_count = totalCount,
        items = items.map {
            Item(
                name = it.name,
                full_name = it.fullName,
                userModel = UserModel(
                    login = it.owner.login,
                    id = it.owner.id,
                    avatar_url = it.owner.avatarUrl,
                ),
                html_url = it.htmlUrl,
                description = it.description,
                stargazers_count = it.stargazersCount,
                forks_count = it.forksCount,
                forks = it.forks
            )
        },
    )
}