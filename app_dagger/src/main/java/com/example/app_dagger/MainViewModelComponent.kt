package com.example.app_dagger

import dagger.Subcomponent
import javax.inject.Scope


@Scope
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class ViewModelScoped

@ViewModelScoped
@Subcomponent
interface MainViewModelComponent {
    val viewModelDependency: ViewModelDependency
}
