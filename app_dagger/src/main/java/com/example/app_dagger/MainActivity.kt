package com.example.app_dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var contextDependency: ContextDependency

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MainApplication.daggerAppComponent.mainActComponentBuilder
            .mainActModule(MainActModule(this))
            .build()
            .inject(this)

        Log.d("Tracking", "${contextDependency.appContext}\n${contextDependency.actContext}")
    }
}
