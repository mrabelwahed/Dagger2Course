package com.daggerudemy.di.component

import com.daggerudemy.MainActivity
import dagger.Component

@Component
interface LoginComponent {
    fun inject(mainActivity: MainActivity)
}