package com.daggerudemy.di.component

import com.daggerudemy.MainActivity
import com.daggerudemy.di.LoginManager
import dagger.Component

@Component
interface LoginComponent {
    fun inject(mainActivity: MainActivity)
}