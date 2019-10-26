package com.daggerudemy.di.module

import com.daggerudemy.di.AppLogger
import com.daggerudemy.di.scope.AppScope
import dagger.Module
import dagger.Provides

@Module
class AppModule {
    var index = 0

    @Provides
    @AppScope
    fun getAppLogger(): AppLogger{
        index++
        return AppLogger("index= $index")
    }
}