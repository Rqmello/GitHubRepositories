package com.example.githubrepositories.domain.mapper

import com.example.githubrepositories.data.remote.response.RepositoriesResponse
import com.example.githubrepositories.domain.model.ItemModel
import com.example.githubrepositories.domain.model.RepositoriesModel
import com.example.githubrepositories.domain.model.UserModel

fun RepositoriesResponse.toModel(): RepositoriesModel {
    return RepositoriesModel(
        total_count = totalCount,
        items = items.map {
            ItemModel(
                name = it.name,
                fullName = it.fullName,
                userModel = UserModel(
                    login = it.owner.login,
                    id = it.owner.id,
                    avatarUrl = it.owner.avatarUrl,
                ),
                htmlUrl = it.htmlUrl,
                description = it.description,
                stargazersCount = it.stargazersCount,
                forksCount = it.forksCount,
                forks = it.forks
            )
        },
    )
}