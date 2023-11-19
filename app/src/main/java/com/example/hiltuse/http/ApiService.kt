package com.example.hiltuse.http

import retrofit2.http.GET
import retrofit2.http.Path

/**
 *
 * @create at 2022 12.12
 * @description:
 **/
interface ApiService {

    //页码从0开始
    @GET("article/list/{page}/json")
    suspend fun getArticle(@Path("page") page: Int): Any
}