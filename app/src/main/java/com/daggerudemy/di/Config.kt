package com.daggerudemy.di

import android.util.Log
import javax.inject.Inject

class Config @Inject constructor() {
    var iscacheEbanled = false

    fun enablecache(loginManager: LoginManager){
        iscacheEbanled = true
        Log.d("Caching","$iscacheEbanled")
    }
}