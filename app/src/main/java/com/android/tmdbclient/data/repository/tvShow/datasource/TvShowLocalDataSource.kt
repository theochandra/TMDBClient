package com.android.tmdbclient.data.repository.tvShow.datasource

import com.android.tmdbclient.data.model.tvShow.TvShow

interface TvShowLocalDataSource {

    suspend fun getTvShowsFromDb(): List<TvShow>

    suspend fun saveTvShowsToDb(tvShows: List<TvShow>)

    suspend fun clearAll()

}