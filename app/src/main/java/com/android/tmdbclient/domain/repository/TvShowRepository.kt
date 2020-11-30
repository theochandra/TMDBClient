package com.android.tmdbclient.domain.repository

import com.android.tmdbclient.data.model.tvShow.TvShow

interface TvShowRepository {

    suspend fun getTvShows(): List<TvShow>?

    suspend fun updateTvShows(): List<TvShow>?

}