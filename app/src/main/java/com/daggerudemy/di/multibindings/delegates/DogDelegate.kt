package com.daggerudemy.di.multibindings.delegates

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.daggerudemy.R
import com.daggerudemy.di.multibindings.AnimalData
import javax.inject.Inject

class DogDelegate @Inject constructor() : AnimalDelegates {

    override val viewType: Int = DOG_VIEW_TYPE

    override fun isForViewType(animalData: AnimalData): Boolean {
        return animalData.id == DOG_VIEW_TYPE
    }

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemView = inflater.inflate(R.layout.dog_item, parent, false)
        return CatViewHolder(itemView)
    }

    override fun onBindViewHolder(animalData: AnimalData, holder: RecyclerView.ViewHolder) {
        (holder as CatViewHolder).name.text = animalData.displayName
    }

    companion object {
        const val DOG_VIEW_TYPE = 1
    }
}

class DogViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var name: TextView = itemView.findViewById(R.id.name)

}