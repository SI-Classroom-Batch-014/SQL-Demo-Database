package com.example.demodatabase.db.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Movie(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val name: String,
    val director: String,
    val studio: String,
    val year: Int,
)