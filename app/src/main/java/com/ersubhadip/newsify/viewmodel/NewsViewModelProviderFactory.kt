package com.ersubhadip.newsify.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ersubhadip.newsify.repository.NewsRepository

class NewsViewModelProviderFactory(val newsRepository: NewsRepository):ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NewsViewModel(newsRepository) as T
    }
}