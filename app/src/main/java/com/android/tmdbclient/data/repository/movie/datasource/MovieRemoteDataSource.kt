package com.android.tmdbclient.data.repository.movie.datasource

import com.android.tmdbclient.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {

    suspend fun getMovies(): Response<MovieList>

}