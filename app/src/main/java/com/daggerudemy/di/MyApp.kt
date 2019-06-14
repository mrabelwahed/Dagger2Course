package com.daggerudemy.di

import android.app.Application
import android.util.Log
import com.daggerudemy.di.component.DaggerAppComponent
import com.daggerudemy.di.module.AppModule

class MyApp :Application() {

    override fun onCreate() {
        super.onCreate()
        val appComponent =DaggerAppComponent.builder().appModule(AppModule()).build()
        Log.d(TAG,appComponent.getAppLogger().value)
        Log.d(TAG,appComponent.getAppLogger().value)
        Log.d(TAG,appComponent.getAppLogger().value)
    }

    companion object {
        const val TAG = "MyApp"
    }
}