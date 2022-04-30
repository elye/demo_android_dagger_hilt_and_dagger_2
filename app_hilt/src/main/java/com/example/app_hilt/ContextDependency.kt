package com.example.app_hilt

import android.content.Context
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Named

class ContextDependency @Inject constructor(
    @ApplicationContext val appContext: Context,
    @ActivityContext val actContext: Context
)
