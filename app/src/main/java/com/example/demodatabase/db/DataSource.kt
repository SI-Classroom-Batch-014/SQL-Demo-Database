package com.example.demodatabase.db

import com.example.demodatabase.db.model.Movie

object DataSource {

    val movies = listOf(
        Movie(name = "Inception", director = "Christopher Nolan", studio = "Warner Bros", year = 2010),
        Movie(name = "Interstellar", director = "Christopher Nolan", studio = "Paramount Pictures", year = 2014),
        Movie(name = "The Grand Budapest Hotel", director = "Wes Anderson", studio = "Fox Searchlight Pictures", year = 2014),
        Movie(name = "Parasite", director = "Bong Joon-ho", studio = "CJ Entertainment", year = 2019),
        Movie(name = "Mad Max: Fury Road", director = "George Miller", studio = "Warner Bros", year = 2015),
        Movie(name = "The Lord of the Rings: The Fellowship of the Ring", director = "Peter Jackson", studio = "New Line Cinema", year = 2001),
        Movie(name = "The Matrix", director = "Lana and Lilly Wachowski", studio = "Warner Bros", year = 1999),
        Movie(name = "Pulp Fiction", director = "Quentin Tarantino", studio = "Miramax Films", year = 1994),
        Movie(name = "Blade Runner 2049", director = "Denis Villeneuve", studio = "Warner Bros", year = 2017),
        Movie(name = "Eternal Sunshine of the Spotless Mind", director = "Michel Gondry", studio = "Focus Features", year = 2004)
    )
}
