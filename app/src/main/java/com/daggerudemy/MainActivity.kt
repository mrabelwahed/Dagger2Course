package com.daggerudemy

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.daggerudemy.di.Config
import com.daggerudemy.di.LoginManager
import com.daggerudemy.di.component.DaggerAppComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var loginManager: LoginManager

    @Inject
    lateinit var config: Config

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerAppComponent.create().getLoginComponent().inject(this)

        loginManager.login("ramadan", "123")
        loginManager.enableCache(config)


    }
}



