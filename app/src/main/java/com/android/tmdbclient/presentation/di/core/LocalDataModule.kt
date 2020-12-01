package com.android.tmdbclient.presentation.di.core

import com.android.tmdbclient.data.db.ArtistDao
import com.android.tmdbclient.data.db.MovieDao
import com.android.tmdbclient.data.db.TvShowDao
import com.android.tmdbclient.data.repository.artist.datasource.ArtistLocalDataSource
import com.android.tmdbclient.data.repository.artist.datasourceimpl.ArtistLocalDataSourceImpl
import com.android.tmdbclient.data.repository.movie.datasource.MovieLocalDataSource
import com.android.tmdbclient.data.repository.movie.datasourceimpl.MovieLocalDataSourceImpl
import com.android.tmdbclient.data.repository.tvShow.datasource.TvShowLocalDataSource
import com.android.tmdbclient.data.repository.tvShow.datasourceimpl.TvShowLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao): MovieLocalDataSource {
        return MovieLocalDataSourceImpl(movieDao)
    }

    @Singleton
    @Provides
    fun provideTvShowLocalDataSource(tvShowDao: TvShowDao): TvShowLocalDataSource {
        return TvShowLocalDataSourceImpl(tvShowDao)
    }

    @Singleton
    @Provides
    fun provideArtistLocalDataSource(artistDao: ArtistDao): ArtistLocalDataSource {
        return ArtistLocalDataSourceImpl(artistDao)
    }

}