package com.daggerudemy.di.component

import com.daggerudemy.di.LoginManager
import dagger.Component

@Component
interface LoginComponent {
    fun getLoginManager():LoginManager
}