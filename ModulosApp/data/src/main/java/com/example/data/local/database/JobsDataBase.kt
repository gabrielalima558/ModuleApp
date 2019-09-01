package com.example.data.local.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.data.local.model.AndroidJobCache

@Database(version = 2, entities = [AndroidJobCache::class])
abstract class JobsDataBase: RoomDatabase() {

    abstract fun jobsDao(): JobsDao

    companion object{
        fun createDataBase(context: Context): JobsDao {
            return Room
                .databaseBuilder(context, JobsDataBase::class.java, "Jobs.db")
                .build()
                .jobsDao()
        }
    }
}