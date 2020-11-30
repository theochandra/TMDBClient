package com.android.tmdbclient.data.repository.artist.datasource

import com.android.tmdbclient.data.model.artist.Artist

interface ArtistLocalDataSource {

    suspend fun getArtistsFromDb(): List<Artist>

    suspend fun saveArtistsToDb(artists: List<Artist>)

    suspend fun clearAll()

}