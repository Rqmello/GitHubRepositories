package com.example.githubrepositories.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object HttpClient{

    private val BASE_URL = "https://api.github.com/search/repositories?q=language:Java&sort=stars&page=1"

    val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()
}