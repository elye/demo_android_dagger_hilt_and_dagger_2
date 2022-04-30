package com.example.app_hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

interface MainAppDependencyInterface

@InstallIn(SingletonComponent::class)
@Module
class MainAppModule {

    @Singleton
    @Provides
    fun provideMainAppDependency() : MainAppDependencyInterface =
        object: MainAppDependencyInterface {}
}