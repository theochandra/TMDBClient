package com.android.tmdbclient.presentation.tvShow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.android.tmdbclient.domain.usecase.GetTvShowsUseCase
import com.android.tmdbclient.domain.usecase.UpdateTvShowsUseCase

class TvShowViewModel(
        private val getTvShowsUseCase: GetTvShowsUseCase,
        private val updateTvShowsUseCase: UpdateTvShowsUseCase
) : ViewModel() {

    fun getTvShows() = liveData {
        val tvShowList = getTvShowsUseCase.execute()
        emit(tvShowList)
    }

    fun updateTvShows() = liveData {
        val tvShowList = updateTvShowsUseCase.execute()
        emit(tvShowList)
    }

}