package com.daggerudemy.di

import android.app.Application
import android.util.Log
import com.daggerudemy.di.component.DaggerAppComponent
import com.daggerudemy.di.module.AppModule

class App: Application() {
    override fun onCreate() {
        super.onCreate()

        val appComponnet = DaggerAppComponent.builder().appModule(AppModule()).build()
        Log.d("App",appComponnet.getAppLogger().value)
        Log.d("App",appComponnet.getAppLogger().value)
        Log.d("App",appComponnet.getAppLogger().value)
    }
}