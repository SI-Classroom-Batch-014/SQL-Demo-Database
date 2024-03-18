package com.example.demodatabase.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.demodatabase.db.model.Movie

@Dao
interface MovieDao {

    @Insert
    fun insertAll(movies: List<Movie>)

    @Query("SELECT * FROM movie")
    fun getAll(): LiveData<List<Movie>>

}