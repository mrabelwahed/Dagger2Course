package com.daggerudemy

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.daggerudemy.di.App
import com.daggerudemy.di.multibindings.AnimalAdapter
import com.daggerudemy.di.multibindings.AnimalData
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {


    @Inject
    lateinit var animalAdapter: AnimalAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as App).multibindingAppComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        animalRecyclerview.layoutManager = LinearLayoutManager(this)
        val dummyData = loadData()
        animalAdapter.animalDataList = dummyData
        animalRecyclerview.adapter = animalAdapter
    }

    fun loadData(): List<AnimalData> {
        val dog1 = AnimalData(id = 1, displayName = "dog#1")
        val cat1 = AnimalData(id = 2, displayName = "cat#1")
        val dog2 = AnimalData(id = 1, displayName = "dog#2")
        val animalData = listOf(dog1, cat1, dog2)
        return animalData
    }
}



