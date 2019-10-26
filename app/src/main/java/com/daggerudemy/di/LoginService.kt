package com.daggerudemy.di

import android.util.Log
import javax.inject.Inject

class LoginService @Inject constructor() : ApiService {

    override fun authenticate(username: String, pass: String): String {
        Log.d("ApiService", "authenticate($username , $pass)")
        return "wxydldklkd78dsnjuudiiudf"
    }
}