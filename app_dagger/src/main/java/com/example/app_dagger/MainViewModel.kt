package com.example.app_dagger

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val mainAppDependencyInterface: MainAppDependencyInterface,
    private val viewModelDependency: ViewModelDependency,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    init {
        Log.d("TrackMe", "ViewModel Initialize\n$mainAppDependencyInterface\n$viewModelDependency")
    }

    fun doSomething() {
        Log.d("TrackMe", "ViewModel Running\n$mainAppDependencyInterface\n$viewModelDependency")
    }
}
