package com.daggerudemy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.daggerudemy.di.ApiService
import com.daggerudemy.di.LocalStore
import com.daggerudemy.di.LoginManager
import com.daggerudemy.di.component.DaggerLoginComponent
import javax.inject.Inject
import kotlin.math.log

class MainActivity : AppCompatActivity() {

   @Inject
   lateinit var  loginManager:LoginManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginComponent = DaggerLoginComponent.create()
        loginComponent.inject(this)

       loginManager.login("ramadan", "123")
    }
}



