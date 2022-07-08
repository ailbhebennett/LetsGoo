package com.example.letsgoo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

     var ItemViewList : ArrayList<ItemViewModel> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //add items to list

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<ItemViewModel>()

        for (i in 1..20){
            data.add(ItemViewModel(R.drawable.hotelimage, "Item " + i))
        }

        val adapter = RecyclerViewAdapter(data)

        recyclerView.adapter = adapter


    }
}