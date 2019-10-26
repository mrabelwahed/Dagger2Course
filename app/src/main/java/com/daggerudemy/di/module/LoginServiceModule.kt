package com.daggerudemy.di.module

import com.daggerudemy.di.ApiService
import com.daggerudemy.di.LoginService
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract  class LoginServiceModule {
    @Binds
     abstract fun bindLoginService(loginService: LoginService) :ApiService
}