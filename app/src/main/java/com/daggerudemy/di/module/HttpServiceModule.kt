package com.daggerudemy.di.module

import com.daggerudemy.di.ApiService
import com.daggerudemy.di.HttpService
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class HttpServiceModule {

    @Binds
    abstract  fun bindApiService(httpService: HttpService) : ApiService
}