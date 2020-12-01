package com.android.tmdbclient.presentation.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.android.tmdbclient.domain.usecase.GetMoviesUseCase
import com.android.tmdbclient.domain.usecase.UpdateMovieUseCase

class MovieViewModel(
        private val getMoviesUseCase: GetMoviesUseCase,
        private val updateMovieUseCase: UpdateMovieUseCase
) : ViewModel() {

    fun getMovies() = liveData {
        val movieList = getMoviesUseCase.execute()
        emit(movieList)
    }

    fun updateMovies() = liveData {
        val movieList = updateMovieUseCase.execute()
        emit(movieList)
    }

}