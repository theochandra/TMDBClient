package com.android.tmdbclient.presentation.di.movie

import com.android.tmdbclient.domain.usecase.GetMoviesUseCase
import com.android.tmdbclient.domain.usecase.UpdateMovieUseCase
import com.android.tmdbclient.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {

    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
            getMoviesUseCase: GetMoviesUseCase,
            updateMovieUseCase: UpdateMovieUseCase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(getMoviesUseCase, updateMovieUseCase)
    }

}