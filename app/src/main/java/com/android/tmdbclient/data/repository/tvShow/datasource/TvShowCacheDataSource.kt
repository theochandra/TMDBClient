package com.android.tmdbclient.data.repository.tvShow.datasource

import com.android.tmdbclient.data.model.tvShow.TvShow

interface TvShowCacheDataSource {

    suspend fun getTvShowsFromCache(): List<TvShow>

    suspend fun saveTvShowsToCache(tvShows: List<TvShow>)

}