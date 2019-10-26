package com.daggerudemy.di.component

import com.daggerudemy.MainActivity
import com.daggerudemy.di.module.LocalStoreModule
import com.daggerudemy.di.module.LoginServiceModule
import dagger.Component

@Component(modules = [LocalStoreModule::class , LoginServiceModule::class])
interface LoginComponent {
    fun inject(mainActivity: MainActivity)
}