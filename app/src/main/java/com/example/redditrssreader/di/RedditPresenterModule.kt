package com.example.redditrssreader.di

import com.example.redditrssreader.data.RedditRepository
import com.example.redditrssreader.presenter.RedditPresenter
import com.example.redditrssreader.view.RedditNewsActivity
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [RedditRepositoryModule::class])
class RedditPresenterModule {
    @Singleton
    @Provides
    fun presenter(repository: RedditRepository): RedditPresenter<RedditNewsActivity> {
        return RedditPresenter(repository)
    }
}