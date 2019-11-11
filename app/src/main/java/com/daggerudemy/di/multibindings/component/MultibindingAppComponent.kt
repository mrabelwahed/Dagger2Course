package com.daggerudemy.di.multibindings.component

import android.app.Application
import com.daggerudemy.MainActivity
import com.daggerudemy.di.multibindings.module.MultibindingAppModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(MultibindingAppModule::class))
interface MultibindingAppComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {
        fun build(): MultibindingAppComponent
        @BindsInstance
        fun application(application: Application): Builder
    }
}