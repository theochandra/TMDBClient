package com.android.tmdbclient.presentation.di.artist

import com.android.tmdbclient.domain.usecase.GetArtistsUseCase
import com.android.tmdbclient.domain.usecase.UpdateArtistsUseCase
import com.android.tmdbclient.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ArtistModule {

    @ArtistScope
    @Provides
    fun provideArtistViewModelFactory(
            getArtistsUseCase: GetArtistsUseCase,
            updateArtistsUseCase: UpdateArtistsUseCase
    ): ArtistViewModelFactory {
        return ArtistViewModelFactory(getArtistsUseCase, updateArtistsUseCase)
    }

}