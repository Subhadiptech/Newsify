package com.ersubhadip.newsify.api

import com.ersubhadip.newsify.Constants.Companion.API_KEY
import com.ersubhadip.newsify.models.NewsResponseModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {

    @GET("/v2/tod-headlines")
    suspend fun getBreakingNews(
        @Query("country")
        countryCode: String = "in",
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey:String = API_KEY

    ):Response<NewsResponseModel>


    @GET("/v2/everything")
    suspend fun getSearchedNews(
        @Query("q")
        querySearch: String,
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey:String = API_KEY

    ):Response<NewsResponseModel>


}