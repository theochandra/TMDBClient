package com.android.tmdbclient.presentation.di.core

import com.android.tmdbclient.data.repository.artist.datasource.ArtistCacheDataSource
import com.android.tmdbclient.data.repository.artist.datasourceimpl.ArtistCacheDataSourceImpl
import com.android.tmdbclient.data.repository.movie.datasource.MovieCacheDataSource
import com.android.tmdbclient.data.repository.movie.datasourceimpl.MovieCacheDataSourceImpl
import com.android.tmdbclient.data.repository.tvShow.datasource.TvShowCacheDataSource
import com.android.tmdbclient.data.repository.tvShow.datasource.TvShowLocalDataSource
import com.android.tmdbclient.data.repository.tvShow.datasourceimpl.TvShowCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {

    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCacheDataSource {
        return MovieCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideTvShowCacheDataSource(): TvShowCacheDataSource {
        return TvShowCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideArtistCacheDataSource(): ArtistCacheDataSource {
        return ArtistCacheDataSourceImpl()
    }

}