package com.android.tmdbclient.domain.repository

import com.android.tmdbclient.data.model.artist.Artist

interface ArtistRepository {

    suspend fun getArtist(): List<Artist>?

    suspend fun updateArtist(): List<Artist>?

}