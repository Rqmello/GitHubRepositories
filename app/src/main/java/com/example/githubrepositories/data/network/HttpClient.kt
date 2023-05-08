package com.example.githubrepositories.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object HttpClient{

    private val BASE_URL = "https://api.github.com/"

    val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()
}