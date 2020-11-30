package com.android.tmdbclient.data.repository.tvShow.datasourceimpl

import com.android.tmdbclient.data.model.tvShow.TvShow
import com.android.tmdbclient.data.repository.tvShow.datasource.TvShowCacheDataSource

class TvShowCacheDataSourceImpl : TvShowCacheDataSource {

    private var tvShowList = ArrayList<TvShow>()

    override suspend fun getTvShowsFromCache(): List<TvShow> {
        return tvShowList
    }

    override suspend fun saveTvShowsToCache(tvShows: List<TvShow>) {
        tvShowList.clear()
        tvShowList = ArrayList(tvShows)
    }

}