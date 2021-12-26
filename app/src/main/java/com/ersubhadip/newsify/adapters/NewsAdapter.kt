package com.ersubhadip.newsify.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.ersubhadip.newsify.R
import com.ersubhadip.newsify.models.Article

class NewsAdapter : RecyclerView.Adapter<NewsAdapter.ArticlesViewHolder>() {

    inner class ArticlesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

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
        return ArticlesViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.news_item_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ArticlesViewHolder, position: Int) {
        holder.itemView.apply {
            //Use ViewBinding
            TODO("Read about viewBinding before implementing it")
        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }
}