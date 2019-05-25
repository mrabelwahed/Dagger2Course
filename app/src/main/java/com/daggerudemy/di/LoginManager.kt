package com.daggerudemy.di

import javax.inject.Inject

class LoginManager  @Inject constructor(val localStore: LocalStore , val apiService: ApiService){

    fun login(username : String , pass:String){

    }

    @Inject
    fun enableCache(cache: Cache){
        cache.registerCache(this)
    }


}