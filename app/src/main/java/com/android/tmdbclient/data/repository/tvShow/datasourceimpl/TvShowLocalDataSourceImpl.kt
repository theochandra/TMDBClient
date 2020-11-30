package com.android.tmdbclient.data.repository.tvShow.datasourceimpl

import com.android.tmdbclient.data.db.TvShowDao
import com.android.tmdbclient.data.model.tvShow.TvShow
import com.android.tmdbclient.data.repository.tvShow.datasource.TvShowLocalDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TvShowLocalDataSourceImpl(
        private val tvShowDao: TvShowDao
) : TvShowLocalDataSource {

    override suspend fun getTvShowsFromDb(): List<TvShow> {
        return tvShowDao.getTvShows()
    }

    override suspend fun saveTvShowsToDb(tvShows: List<TvShow>) {
        CoroutineScope(Dispatchers.IO).launch {
            tvShowDao.saveTvShows(tvShows)
        }
    }

    override suspend fun clearAll() {
        CoroutineScope(Dispatchers.IO).launch {
            tvShowDao.deleteAllTvShows()
        }
    }

}