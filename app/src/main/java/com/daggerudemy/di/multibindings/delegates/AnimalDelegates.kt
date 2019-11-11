package com.daggerudemy.di.multibindings.delegates

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.daggerudemy.di.multibindings.AnimalData

interface AnimalDelegates {

    val viewType: Int

    fun isForViewType(shapeData: AnimalData): Boolean

    fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder

    fun onBindViewHolder(shapeData: AnimalData, holder: RecyclerView.ViewHolder)
}