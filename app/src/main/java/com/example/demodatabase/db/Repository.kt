package com.example.demodatabase.db

import androidx.lifecycle.LiveData
import com.example.demodatabase.db.model.Movie

class Repository(private val database: MovieDatabase) {

    val apartments: LiveData<List<Movie>> = database.appartmentDao.getAll()

    suspend fun prepopulateDB() {
        try {
            database.appartmentDao.insertAll(DataSource.movies)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}