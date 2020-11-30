package com.android.tmdbclient.data.repository.tvShow.datasourceimpl

import com.android.tmdbclient.data.api.TMDBService
import com.android.tmdbclient.data.model.tvShow.TvShowList
import com.android.tmdbclient.data.repository.tvShow.datasource.TvShowRemoteDataSource
import retrofit2.Response

class TvShowRemoteDataSourceImpl(
        private val tmdbService: TMDBService,
        private val apiKey: String
) : TvShowRemoteDataSource {

    override suspend fun getTvShows(): Response<TvShowList> = tmdbService.getPopularTvShows(apiKey)

}