package com.example.app_dagger

import android.content.Context
import javax.inject.Inject
import javax.inject.Named

class ContextDependency @Inject constructor(
    @Named("Application") val appContext: Context,
    @Named("Activity") val actContext: Context
)
