package com.ersubhadip.newsify.Database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.ersubhadip.newsify.models.Article

@Dao
interface ArticleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addOrUpdateArticles(article: Article):Long

    @Query("SELECT * FROM articles ORDER BY id ASC")
    suspend fun getAllArticles():LiveData<List<Article>>

    @Delete
    suspend fun deleteArticle(article: Article)
}