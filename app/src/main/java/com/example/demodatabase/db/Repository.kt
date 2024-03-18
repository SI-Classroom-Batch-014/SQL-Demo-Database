package com.example.demodatabase.db

import androidx.lifecycle.LiveData
import com.example.demodatabase.db.model.Movie

class Repository(private val database: MovieDatabase) {

    val movies: LiveData<List<Movie>> = database.movieDao.getAll()

    suspend fun prepopulateDB() {
        try {
            if (database.movieDao.isEmpty()) {
                database.movieDao.insertAll(DataSource.movies)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}