package com.example.moviesearch.data.api

import com.example.moviesearch.data.model.Movie

data class MovieResponse(
    val results: List<Movie>,
)