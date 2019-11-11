package com.daggerudemy.di.multibindings

import dagger.Module
import dagger.Provides
import dagger.multibindings.ElementsIntoSet
import dagger.multibindings.IntoSet

@Module
class SimpleMultibindings {

    @Provides
    fun provideSetOfStrings():Set<String>{
        return  setOf("A")
    }


    @Provides
    @IntoSet
    fun provideUsingIntoSet():String{
        return "A"
    }

    @Provides
    @ElementsIntoSet
    fun provideUsingElementIntoSet():Set<String>{
        return setOf("A")
    }
}