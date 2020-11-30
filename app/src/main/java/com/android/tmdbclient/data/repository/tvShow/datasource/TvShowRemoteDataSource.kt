package com.android.tmdbclient.data.repository.tvShow.datasource

import com.android.tmdbclient.data.model.tvShow.TvShowList
import retrofit2.Response

interface TvShowRemoteDataSource {

    suspend fun getTvShows(): Response<TvShowList>

}