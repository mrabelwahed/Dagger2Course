package com.daggerudemy.di.multibindings

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.daggerudemy.R

class OldAnimalAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        const val DOG_VIEW_TYPE = 1
        const val Cat_VIEW_TYPE = 2
    }

    var animalDataList: List<AnimalData> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun getItemViewType(position: Int): Int {
        val animalData = animalDataList.get(position)
        when {
            animalData.id == DOG_VIEW_TYPE -> {
                return DOG_VIEW_TYPE
            }

            animalData.id == Cat_VIEW_TYPE -> {
                return Cat_VIEW_TYPE
            }
            else -> {
                return Cat_VIEW_TYPE
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        when (viewType) {
            Cat_VIEW_TYPE -> {
                val itemView = inflater.inflate(R.layout.cat_item, parent, false)
                return CatViewHolder(itemView)
            }
            DOG_VIEW_TYPE -> {
                val itemView = inflater.inflate(R.layout.dog_item, parent, false)
                return DogViewHolder(itemView)
            }
            else -> {
            val itemView = inflater.inflate(R.layout.dog_item, parent, false)
            return DogViewHolder(itemView)
        }

        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val shapeData = animalDataList.get(position)

        when (holder.itemViewType) {
            Cat_VIEW_TYPE -> {
                (holder as CatViewHolder).name.text = shapeData.displayName
            }
            DOG_VIEW_TYPE -> {
                (holder as DogViewHolder).name.text = shapeData.displayName
            }

        }
    }

    override fun getItemCount(): Int {
        return animalDataList.size
    }

    class CatViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var name: TextView

        init {
            name = itemView.findViewById(R.id.name)
        }
    }


    class DogViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var name: TextView

        init {
            name = itemView.findViewById(R.id.name)
        }
    }

}