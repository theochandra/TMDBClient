package com.android.tmdbclient.data.repository.movie.datasource

import com.android.tmdbclient.data.model.movie.Movie

interface MovieCacheDataSource {

    suspend fun getMoviesFromCache(): List<Movie>

    suspend fun saveMoviesToCache(movies: List<Movie>)

}