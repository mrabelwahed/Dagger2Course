package com.daggerudemy.di

import android.app.Application
import com.daggerudemy.di.multibindings.component.DaggerMultibindingAppComponent
import com.daggerudemy.di.multibindings.component.MultibindingAppComponent

class App: Application() {

    lateinit var multibindingAppComponent: MultibindingAppComponent

    override fun onCreate() {
        super.onCreate()

        multibindingAppComponent = DaggerMultibindingAppComponent.builder()
            .application(this)
            .build()
    }
}