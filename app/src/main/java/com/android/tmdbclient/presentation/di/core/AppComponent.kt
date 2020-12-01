package com.android.tmdbclient.presentation.di.core

import com.android.tmdbclient.presentation.di.artist.ArtistSubComponent
import com.android.tmdbclient.presentation.di.movie.MovieSubComponent
import com.android.tmdbclient.presentation.di.tvShow.TvShowSubComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AppModule::class,
    NetModule::class,
    DatabaseModule::class,
    UseCaseModule::class,
    RepositoryModule::class,
    RemoteDataModule::class,
    LocalDataModule::class,
    CacheDataModule::class
])
interface AppComponent {

    fun movieSubComponent(): MovieSubComponent.Factory

    fun tvShowSubComponent(): TvShowSubComponent.Factory

    fun artistSubComponent(): ArtistSubComponent.Factory

}