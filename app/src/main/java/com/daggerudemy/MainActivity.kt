package com.daggerudemy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.daggerudemy.di.ApiService
import com.daggerudemy.di.LocalStore
import com.daggerudemy.di.LoginManager
import com.daggerudemy.di.component.DaggerLoginComponent
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginComponent = DaggerLoginComponent.create()

        loginComponent.getLoginManager().login("ramadan", "123")
    }
}



