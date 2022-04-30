package com.example.app_dagger

import android.app.Application

class MainApplication: Application() {
    companion object {
        lateinit var daggerAppComponent: MainAppComponent
    }

    override fun onCreate() {
        super.onCreate()
        daggerAppComponent = DaggerMainAppComponent.builder().mainAppModule(MainAppModule(this)).build()
    }
}
