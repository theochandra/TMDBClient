package com.android.tmdbclient.presentation.di.tvShow

import com.android.tmdbclient.presentation.tvShow.TvShowActivity
import dagger.Subcomponent

@TvShowScope
@Subcomponent(modules = [TvShowModule::class])
interface TvShowSubComponent {

    fun inject(tvShowActivity: TvShowActivity)

    @Subcomponent.Factory
    interface Factory {

        fun create(): TvShowSubComponent

    }

}