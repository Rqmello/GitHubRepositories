package com.example.githubrepositories.data.api

import com.example.githubrepositories.data.remote.response.PullRequestItemResponse
import com.example.githubrepositories.data.remote.response.RepositoriesResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface GitHubAPI {

    //search/repositories?q=language:Java&sort=stars&page=1
    @GET("/search/repositories")
    suspend fun getAllRepositories(
        @Query("q") language: String,
        @Query("sort") sort: String,
        @Query("page") page: Int,
    ): RepositoriesResponse

    @GET("/repos/{criador}/{repositorio}/pulls")
    suspend fun getAllPullsRepositories(
        @Path("criador") login: String,
        @Path("repositorio") repositorio: String
    ): List<PullRequestItemResponse>

}
