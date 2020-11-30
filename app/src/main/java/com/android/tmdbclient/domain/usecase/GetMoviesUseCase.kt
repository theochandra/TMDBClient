package com.android.tmdbclient.domain.usecase

import com.android.tmdbclient.data.model.movie.Movie
import com.android.tmdbclient.domain.repository.MovieRepository

class GetMoviesUseCase(private val movieRepository: MovieRepository) {

    suspend fun execute(): List<Movie>? = movieRepository.getMovies()

}