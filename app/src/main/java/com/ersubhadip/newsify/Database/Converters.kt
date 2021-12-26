package com.ersubhadip.newsify.Database

import androidx.room.TypeConverter
import com.ersubhadip.newsify.models.Source

class Converters {

    @TypeConverter
    fun getSource(source: Source):String{
        return source.name
    }

    @TypeConverter
    fun toSource(name:String):Source{
        return Source(name,name)
    }
}