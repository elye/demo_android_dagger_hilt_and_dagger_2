package com.example.app_dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var contextDependency: ContextDependency

    @Inject
    lateinit var mainAppDependencyInterface: MainAppDependencyInterface

    private val viewModel: MainViewModel by viewModels{
        MainViewModelFactory(this, mainAppDependencyInterface, intent.extras)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MainApplication.daggerAppComponent.mainActComponentBuilder
            .mainActModule(MainActModule(this))
            .build()
            .inject(this)

        Log.d("TrackMe", "Activity\n${contextDependency.appContext}\n${contextDependency.actContext}")

        viewModel.doSomething()
    }
}
