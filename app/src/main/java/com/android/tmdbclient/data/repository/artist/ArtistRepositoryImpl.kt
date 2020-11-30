package com.android.tmdbclient.data.repository.artist

import android.util.Log
import com.android.tmdbclient.data.model.artist.Artist
import com.android.tmdbclient.data.repository.artist.datasource.ArtistCacheDataSource
import com.android.tmdbclient.data.repository.artist.datasource.ArtistLocalDataSource
import com.android.tmdbclient.data.repository.artist.datasource.ArtistRemoteDataSource
import com.android.tmdbclient.domain.repository.ArtistRepository

class ArtistRepositoryImpl(
        private val artistRemoteDataSource: ArtistRemoteDataSource,
        private val artistLocalDataSource: ArtistLocalDataSource,
        private val artistCacheDataSource: ArtistCacheDataSource
) : ArtistRepository {

    override suspend fun getArtist(): List<Artist>? {
        return getArtistsFromCache()
    }

    override suspend fun updateArtist(): List<Artist>? {
        val newListOfArtists = getArtistsFromApi()
        artistLocalDataSource.clearAll()
        artistLocalDataSource.saveArtistsToDb(newListOfArtists)
        artistCacheDataSource.saveArtistsToCache(newListOfArtists)
        return newListOfArtists
    }

    private suspend fun getArtistsFromApi(): List<Artist> {
        lateinit var artistList: List<Artist>

        try {
            val response = artistRemoteDataSource.getArtists()
            val body = response.body()
            if (body != null) {
                artistList = body.artists
            }
        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }

        return artistList
    }

    private suspend fun getArtistsFromDb(): List<Artist> {
        lateinit var artistList: List<Artist>

        try {
            artistList = artistLocalDataSource.getArtistsFromDb()
        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }

        if (artistList.isNotEmpty()) {
            return artistList
        } else {
            artistList = getArtistsFromApi()
            artistLocalDataSource.saveArtistsToDb(artistList)
        }

        return artistList
    }

    private suspend fun getArtistsFromCache(): List<Artist> {
        lateinit var artistList: List<Artist>

        try {
            artistList = artistCacheDataSource.getArtistsFromCache()
        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }

        if (artistList.isNotEmpty()) {
            return artistList
        } else {
            artistList = getArtistsFromDb()
            artistCacheDataSource.saveArtistsToCache(artistList)
        }

        return artistList
    }

}