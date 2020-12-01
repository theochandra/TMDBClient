package com.android.tmdbclient.presentation.di

import com.android.tmdbclient.presentation.di.artist.ArtistSubComponent
import com.android.tmdbclient.presentation.di.movie.MovieSubComponent
import com.android.tmdbclient.presentation.di.tvShow.TvShowSubComponent

interface Injector {

    fun createMovieSubComponent(): MovieSubComponent

    fun createTvShowSubComponent(): TvShowSubComponent

    fun createArtistSubComponent(): ArtistSubComponent

}