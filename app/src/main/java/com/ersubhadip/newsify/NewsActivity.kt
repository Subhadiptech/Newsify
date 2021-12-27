package com.ersubhadip.newsify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.ersubhadip.newsify.Database.ArticleDatabase
import com.ersubhadip.newsify.databinding.ActivityNewsBinding
import com.ersubhadip.newsify.repository.NewsRepository
import com.ersubhadip.newsify.viewmodel.NewsViewModel
import com.ersubhadip.newsify.viewmodel.NewsViewModelProviderFactory
import com.google.android.material.bottomnavigation.BottomNavigationView

class NewsActivity : AppCompatActivity() {

    lateinit var binding: ActivityNewsBinding
    lateinit var newsViewModel:NewsViewModel
    //qwdkqw

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val newsRepository = NewsRepository(ArticleDatabase.getDatabase(this))
        val newsViewModelFactory = NewsViewModelProviderFactory(newsRepository)
        newsViewModel = ViewModelProvider(this,newsViewModelFactory).get(newsViewModel::class.java)

//        binding.bottomNav.setupWithNavController()


    }
}