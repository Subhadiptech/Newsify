package com.ersubhadip.newsify.models

data class NewsResponseModel(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)