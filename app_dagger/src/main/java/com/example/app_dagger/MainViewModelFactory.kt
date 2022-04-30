package com.example.app_dagger

import android.os.Bundle
import androidx.lifecycle.AbstractSavedStateViewModelFactory
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.savedstate.SavedStateRegistryOwner

class MainViewModelFactory(
    owner: SavedStateRegistryOwner,
    private val mainAppDependencyInterface: MainAppDependencyInterface,
    defaultArgs: Bundle? = null
) : AbstractSavedStateViewModelFactory(owner, defaultArgs) {
    override fun <T : ViewModel> create(
        key: String, modelClass: Class<T>, handle: SavedStateHandle
    ): T {
        val dependency = MainApplication.daggerAppComponent.mainViewModelComponent.viewModelDependency
        return MainViewModel(
            mainAppDependencyInterface,
            dependency,
            handle
        ) as T
    }
}