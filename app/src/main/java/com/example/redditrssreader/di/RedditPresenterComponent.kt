package com.example.redditrssreader.di

import com.example.redditrssreader.presenter.RedditPresenter
import com.example.redditrssreader.view.RedditNewsActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RedditPresenterModule::class])
interface RedditPresenterComponent {
    fun get(): RedditPresenter<RedditNewsActivity>
    fun inject(view: RedditNewsActivity)
}