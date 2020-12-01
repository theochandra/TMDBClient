package com.android.tmdbclient.presentation.di.tvShow

import com.android.tmdbclient.domain.usecase.GetMoviesUseCase
import com.android.tmdbclient.domain.usecase.GetTvShowsUseCase
import com.android.tmdbclient.domain.usecase.UpdateMovieUseCase
import com.android.tmdbclient.domain.usecase.UpdateTvShowsUseCase
import com.android.tmdbclient.presentation.movie.MovieViewModelFactory
import com.android.tmdbclient.presentation.tvShow.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {

    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
            getTvShowsUseCase: GetTvShowsUseCase,
            updateTvShowsUseCase: UpdateTvShowsUseCase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(getTvShowsUseCase, updateTvShowsUseCase)
    }

}