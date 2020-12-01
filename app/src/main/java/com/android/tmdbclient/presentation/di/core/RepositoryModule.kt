package com.android.tmdbclient.presentation.di.core

import com.android.tmdbclient.data.repository.artist.ArtistRepositoryImpl
import com.android.tmdbclient.data.repository.artist.datasource.ArtistCacheDataSource
import com.android.tmdbclient.data.repository.artist.datasource.ArtistLocalDataSource
import com.android.tmdbclient.data.repository.artist.datasource.ArtistRemoteDataSource
import com.android.tmdbclient.data.repository.movie.MovieRepositoryImpl
import com.android.tmdbclient.data.repository.movie.datasource.MovieCacheDataSource
import com.android.tmdbclient.data.repository.movie.datasource.MovieLocalDataSource
import com.android.tmdbclient.data.repository.movie.datasource.MovieRemoteDataSource
import com.android.tmdbclient.data.repository.tvShow.TvShowsRepositoryImpl
import com.android.tmdbclient.data.repository.tvShow.datasource.TvShowCacheDataSource
import com.android.tmdbclient.data.repository.tvShow.datasource.TvShowLocalDataSource
import com.android.tmdbclient.data.repository.tvShow.datasource.TvShowRemoteDataSource
import com.android.tmdbclient.domain.repository.ArtistRepository
import com.android.tmdbclient.domain.repository.MovieRepository
import com.android.tmdbclient.domain.repository.TvShowRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun provideMovieRepository(
            movieRemoteDataSource: MovieRemoteDataSource,
            movieLocalDataSource: MovieLocalDataSource,
            movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {
        return MovieRepositoryImpl(movieRemoteDataSource, movieLocalDataSource, movieCacheDataSource)
    }

    @Singleton
    @Provides
    fun provideTvShowRepository(
            tvShowRemoteDataSource: TvShowRemoteDataSource,
            tvShowLocalDataSource: TvShowLocalDataSource,
            tvShowCacheDataSource: TvShowCacheDataSource
    ): TvShowRepository {
        return TvShowsRepositoryImpl(tvShowRemoteDataSource, tvShowLocalDataSource, tvShowCacheDataSource)
    }

    @Singleton
    @Provides
    fun provideArtistRepository(
            artistRemoteDataSource: ArtistRemoteDataSource,
            artistLocalDataSource: ArtistLocalDataSource,
            artistCacheDataSource: ArtistCacheDataSource
    ): ArtistRepository {
        return ArtistRepositoryImpl(artistRemoteDataSource, artistLocalDataSource, artistCacheDataSource)
    }

}