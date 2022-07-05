package com.example.letsgoo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.letsgoo.RecyclerViewAdapter
import com.example.letsgoo.RecyclerViewAdapter.ViewHolder

class MainActivity : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? =null
    private var adapter: RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutManager = LinearLayoutManager(this)

        recyclerView.LayoutManager = layoutManager

        adapter = RecyclerViewAdapter()
        recyclerView.adapter = adapter


    }
}