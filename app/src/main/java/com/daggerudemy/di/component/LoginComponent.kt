package com.daggerudemy.di.component

import com.daggerudemy.MainActivity
import com.daggerudemy.di.module.LocalStoreModule
import com.daggerudemy.di.module.LoginServiceModule
import com.daggerudemy.di.scope.ActivityScope
import dagger.Component
import dagger.Subcomponent

@ActivityScope
@Subcomponent( modules = [LocalStoreModule::class , LoginServiceModule::class])
interface LoginComponent {
    fun inject(mainActivity: MainActivity)
}