package com.example.githubrepositories.domain.repository

import com.example.githubrepositories.data.remote.response.RepositoriesResponse
import com.example.githubrepositories.domain.model.PullRequestItemModel
import com.example.githubrepositories.domain.model.RepositoriesModel

interface IRepository {

    suspend fun getAllRepositories(language: String, sort: String, page: Int): RepositoriesModel

    suspend fun getAllPullRepositories(criador: String, repositorio: String): PullRequestItemModel
}