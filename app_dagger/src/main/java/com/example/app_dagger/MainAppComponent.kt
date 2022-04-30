package com.example.app_dagger

import android.app.Application
import android.content.Context
import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [MainAppModule::class])
interface MainAppComponent {
    val mainActComponentBuilder : MainActComponent.Builder
}

@Module
class MainAppModule(private val application: Application) {

    @Singleton
    @Provides @Named("Application")
    fun context(): Context = application
}
