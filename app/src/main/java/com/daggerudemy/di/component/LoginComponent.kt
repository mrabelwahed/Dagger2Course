package com.daggerudemy.di.component

import com.daggerudemy.MainActivity
import com.daggerudemy.di.LoginManager
import com.daggerudemy.di.module.HttpServiceModule
import com.daggerudemy.di.module.LocalStoreModule
import dagger.Component

@Component(modules = [LocalStoreModule::class , HttpServiceModule::class])
interface LoginComponent {
    fun inject(mainActivity: MainActivity)
}