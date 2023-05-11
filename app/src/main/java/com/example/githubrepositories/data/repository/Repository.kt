package com.example.githubrepositories.data.repository

import com.example.githubrepositories.data.api.GitHubAPI
import com.example.githubrepositories.data.network.HttpClient
import com.example.githubrepositories.data.remote.response.PullRequestItemResponse
import com.example.githubrepositories.data.remote.response.RepositoriesResponse
import com.example.githubrepositories.domain.mapper.toModel
import com.example.githubrepositories.domain.model.PullRequestItemModel
import com.example.githubrepositories.domain.model.RepositoriesModel
import com.example.githubrepositories.domain.repository.IRepository

class Repository : IRepository {

    private val api = HttpClient.retrofit.create(GitHubAPI::class.java)

    override suspend fun getAllRepositories(language: String, sort: String, page: Int): RepositoriesModel {
        return api.getAllRepositories(language, sort, page).toModel()
    }

    override suspend fun getAllPullRepositories(criador: String, repositorio: String): PullRequestItemModel{
        return api.getAllPullsRepositories(criador, repositorio).toModel()
    }
}