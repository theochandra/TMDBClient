package com.android.tmdbclient.presentation.di.core

import com.android.tmdbclient.data.api.TMDBService
import com.android.tmdbclient.data.repository.artist.datasource.ArtistRemoteDataSource
import com.android.tmdbclient.data.repository.artist.datasourceimpl.ArtistRemoteDataSourceImpl
import com.android.tmdbclient.data.repository.movie.datasource.MovieRemoteDataSource
import com.android.tmdbclient.data.repository.movie.datasourceimpl.MovieRemoteDataSourceImpl
import com.android.tmdbclient.data.repository.tvShow.datasource.TvShowRemoteDataSource
import com.android.tmdbclient.data.repository.tvShow.datasourceimpl.TvShowRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey: String) {

    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService): MovieRemoteDataSource {
        return MovieRemoteDataSourceImpl(tmdbService, apiKey)
    }

    @Singleton
    @Provides
    fun provideTvShowRemoteDataSource(tmdbService: TMDBService): TvShowRemoteDataSource {
        return TvShowRemoteDataSourceImpl(tmdbService, apiKey)
    }

    @Singleton
    @Provides
    fun provideArtistRemoteDataSource(tmdbService: TMDBService): ArtistRemoteDataSource {
        return ArtistRemoteDataSourceImpl(tmdbService, apiKey)
    }

}