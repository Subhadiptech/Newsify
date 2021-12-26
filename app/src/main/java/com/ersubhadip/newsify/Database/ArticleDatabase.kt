package com.ersubhadip.newsify.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.ersubhadip.newsify.models.Article


@Database(
    entities = [Article::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class ArticleDatabase:RoomDatabase() {

    abstract fun articleDao():ArticleDao

    companion object{
        @Volatile
        private var INSTANCE:ArticleDatabase?=null

        fun getDatabase(context: Context):ArticleDatabase{

            synchronized(this){
                return INSTANCE?:Room.databaseBuilder(
                    context.applicationContext,
                    ArticleDatabase::class.java,
                    "article_db"
                ).build().also {
                    INSTANCE = it
                }
            }

        }

    }
}