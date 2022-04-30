package com.example.app_dagger

import android.app.Activity
import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.Subcomponent
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Scope

@Scope
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class ActivityScope

@ActivityScope
@Subcomponent(modules = [MainActModule::class])
interface MainActComponent {
    fun inject(activity: MainActivity)

    @Subcomponent.Builder
    interface Builder {
        fun mainActModule(module: MainActModule): Builder
        fun build(): MainActComponent
    }
}

@Module
class MainActModule(private val activity: Activity) {
    @ActivityScope
    @Provides
    @Named("Activity")
    fun context(): Context = activity
}
