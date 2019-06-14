package com.daggerudemy.di.module

import com.daggerudemy.di.AppLogger
import com.daggerudemy.di.scope.AppScope
import dagger.Module
import dagger.Provides

@Module
class AppModule {
    private var index = 0

    @Provides
    @AppScope
    fun provideAppLogger():AppLogger{
        index++
        return  AppLogger("App Logger Index: $index")
    }
}