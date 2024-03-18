package com.example.demodatabase.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.demodatabase.db.model.Movie

@Database(entities = [Movie::class], version = 1)
abstract class MovieDatabase : RoomDatabase() {

    abstract val appartmentDao: MovieDao
}

private lateinit var INSTANCE: MovieDatabase

fun getDatabase(context: Context): MovieDatabase {

    synchronized(MovieDatabase::class.java) {
        if (!::INSTANCE.isInitialized) {

            INSTANCE = Room.databaseBuilder(
                context.applicationContext,
                MovieDatabase::class.java,
                "movie_database"
            ).build()
        }
        return INSTANCE
    }
}