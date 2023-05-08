package com.example.githubrepositories.domain.mapper

import com.example.githubrepositories.data.remote.response.PullRequestItemResponse
import com.example.githubrepositories.domain.model.PullRequestItemModel
import com.example.githubrepositories.domain.model.UserModel

fun PullRequestItemResponse.toModel(): PullRequestItemModel {
    return PullRequestItemModel(
        title = title,
        body = body,
        created_at = createdAt,
        usuario = UserModel(
            login = user.login,
            id = user.id,
            avatar_url = user.avatarUrl
        )
    )
}