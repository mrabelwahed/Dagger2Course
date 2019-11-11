package com.daggerudemy.di.multibindings.module

import android.app.Application
import android.content.Context
import com.daggerudemy.di.multibindings.delegates.AnimalDelegates
import com.daggerudemy.di.multibindings.delegates.CatDelegate
import com.daggerudemy.di.multibindings.delegates.DogDelegate
import com.daggerudemy.di.multibindings.key.AnimalKey
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

@Module(includes = [AppBindsModule::class])
object MultibindingAppModule {

    @Provides
    @JvmStatic
    fun providesContext(application: Application): Context = application.applicationContext
}

@Module
interface AppBindsModule {

    @Binds
    @IntoMap
    @AnimalKey(CatDelegate.CAT_VIEW_TYPE)
    fun provideCatDelegate(catDelegate: CatDelegate): AnimalDelegates

    @Binds
    @IntoMap
    @AnimalKey(DogDelegate.DOG_VIEW_TYPE)
    fun provideDogDelegate(dogDelegate: DogDelegate): AnimalDelegates


}