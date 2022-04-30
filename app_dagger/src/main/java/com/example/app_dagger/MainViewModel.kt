package com.example.app_dagger

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val mainAppDependencyInterface: MainAppDependencyInterface,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    init {
        Log.d("TrackMe", "ViewModel\n$mainAppDependencyInterface")
    }

    fun doSomething() {}
}
