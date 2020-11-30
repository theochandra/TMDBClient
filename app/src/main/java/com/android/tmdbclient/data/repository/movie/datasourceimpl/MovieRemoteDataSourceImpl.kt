package com.android.tmdbclient.data.repository.movie.datasourceimpl

import com.android.tmdbclient.data.api.TMDBService
import com.android.tmdbclient.data.model.movie.MovieList
import com.android.tmdbclient.data.repository.movie.datasource.MovieRemoteDataSource
import retrofit2.Response

class MovieRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
) : MovieRemoteDataSource {

    override suspend fun getMovies(): Response<MovieList> = tmdbService.getPopularMovies(apiKey)

}