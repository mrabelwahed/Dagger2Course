package com.daggerudemy.di.multibindings

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.daggerudemy.di.multibindings.delegates.AnimalDelegates
import javax.inject.Inject

class AnimalAdapter @Inject constructor(private val animalDelegates: Map<Int, @JvmSuppressWildcards AnimalDelegates>)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

     var animalDataList: List<AnimalData> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun getItemViewType(position: Int): Int {
        val animalData = animalDataList[position]
        return animalDelegates.values
            .firstOrNull { it.isForViewType(animalData) }
            ?.viewType
            ?: throw IllegalArgumentException("No adapter delegate found")
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return animalDelegates.getValue(viewType).onCreateViewHolder(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val animalData = animalDataList[position]
        animalDelegates.getValue(holder.itemViewType).onBindViewHolder(animalData, holder)
    }

    override fun getItemCount(): Int {
        return animalDataList.size
    }

}