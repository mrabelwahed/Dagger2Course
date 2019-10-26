package com.daggerudemy.di.component

import com.daggerudemy.di.AppLogger
import com.daggerudemy.di.module.AppModule
import com.daggerudemy.di.scope.AppScope
import dagger.Component

@AppScope
@Component(modules = [AppModule::class])
interface AppComponent {
    fun getAppLogger():AppLogger
}