package com.android.tmdbclient.data.repository

import com.android.tmdbclient.data.model.movie.Movie
import com.android.tmdbclient.domain.repository.MovieRepository

class MovieRepositoryImpl : MovieRepository {

    override suspend fun getMovies(): List<Movie>? {
        TODO("Not yet implemented")
    }

    override suspend fun updateMovies(): List<Movie>? {
        TODO("Not yet implemented")
    }

}