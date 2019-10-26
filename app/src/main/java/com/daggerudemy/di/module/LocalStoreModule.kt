package com.daggerudemy.di.module

import com.daggerudemy.di.LocalStore
import dagger.Module
import dagger.Provides

@Module
class LocalStoreModule {

    @Provides
    fun provideLocalStore() = LocalStore()
}