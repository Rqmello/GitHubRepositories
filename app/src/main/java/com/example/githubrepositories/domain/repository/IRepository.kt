package com.example.githubrepositories.domain.repository

import com.example.githubrepositories.data.remote.response.RepositoriesResponse

interface IRepository {

    suspend fun getAllRepositories(language: String, sort: String, page: Int): RepositoriesResponse
}