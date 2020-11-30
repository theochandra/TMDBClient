package com.android.tmdbclient.data.repository.artist.datasourceimpl

import com.android.tmdbclient.data.db.ArtistDao
import com.android.tmdbclient.data.model.artist.Artist
import com.android.tmdbclient.data.repository.artist.datasource.ArtistLocalDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ArtistLocalDataSourceImpl(
        private val artistDao: ArtistDao
) : ArtistLocalDataSource {

    override suspend fun getArtistsFromDb(): List<Artist> {
        return artistDao.getArtist()
    }

    override suspend fun saveArtistsToDb(artists: List<Artist>) {
        CoroutineScope(Dispatchers.IO).launch {
            artistDao.saveArtists(artists)
        }
    }

    override suspend fun clearAll() {
        CoroutineScope(Dispatchers.IO).launch {
            artistDao.deleteAllArtists()
        }
    }

}