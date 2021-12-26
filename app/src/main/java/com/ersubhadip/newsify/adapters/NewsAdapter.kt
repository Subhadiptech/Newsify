package com.ersubhadip.newsify.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ersubhadip.newsify.databinding.NewsItemLayoutBinding
import com.ersubhadip.newsify.models.Article

class NewsAdapter : RecyclerView.Adapter<NewsAdapter.ArticlesViewHolder>() {

    inner class ArticlesViewHolder(val binding:NewsItemLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    //DiffUtils Setup
    private val differCallbacks = object : DiffUtil.ItemCallback<Article>() {
        override fun areItemsTheSame(oldItem: Article, newItem: Article): Boolean {
            return oldItem.url == newItem.url
        }

        override fun areContentsTheSame(oldItem: Article, newItem: Article): Boolean {
            return oldItem == newItem
        }


    }

    private val differ = AsyncListDiffer(this, differCallbacks)

    //end


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticlesViewHolder {
        val binding = NewsItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ArticlesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ArticlesViewHolder, position: Int) {
       holder.binding.apply {
             TODO("Do it later : Glide error")
       }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }
}