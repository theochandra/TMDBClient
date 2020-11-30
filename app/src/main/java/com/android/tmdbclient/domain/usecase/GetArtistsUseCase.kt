package com.android.tmdbclient.domain.usecase

import com.android.tmdbclient.data.model.artist.Artist
import com.android.tmdbclient.domain.repository.ArtistRepository

class GetArtistsUseCase(private val artistRepository: ArtistRepository) {

    suspend fun execute(): List<Artist>? = artistRepository.getArtist()

}