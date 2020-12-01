package com.android.tmdbclient.presentation.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.android.tmdbclient.domain.usecase.GetMoviesUseCase
import com.android.tmdbclient.domain.usecase.UpdateMovieUseCase

class MovieViewModelFactory(
        private val getMoviesUseCase: GetMoviesUseCase,
        private val updateMovieUseCase: UpdateMovieUseCase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MovieViewModel(getMoviesUseCase, updateMovieUseCase) as T
    }

}