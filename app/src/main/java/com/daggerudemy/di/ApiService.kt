package com.daggerudemy.di

import android.util.Log
import javax.inject.Inject

interface ApiService {
    fun authenticate(username: String, pass: String): String
}