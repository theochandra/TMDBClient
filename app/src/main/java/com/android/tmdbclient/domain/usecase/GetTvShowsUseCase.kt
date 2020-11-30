package com.android.tmdbclient.domain.usecase

import com.android.tmdbclient.data.model.tvShow.TvShow
import com.android.tmdbclient.domain.repository.TvShowRepository

class GetTvShowsUseCase(private val tvShowRepository: TvShowRepository) {

    suspend fun execute(): List<TvShow>? = tvShowRepository.getTvShows()

}