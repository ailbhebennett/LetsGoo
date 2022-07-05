package com.example.letsgoo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var title = arrayOf("hotel 1", "resturant 2", "bar 3", "hotel 2")
    var detail = arrayOf("nice hotel", "nice resturant", "nice bar", "lovely hotel")
    var images = intArrayOf(R.drawable.hotelimage,R.drawable.hotelimage,R.drawable.hotelimage,R.drawable.hotelimage)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.activity_main, parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return title.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.itemImage
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImages: ImageView
        var itemTitles: TextView
        var itemDetails: TextView

        init{
            itemImages = itemView.findViewById(R.id.itemImage)
            itemTitles = itemView.findViewById(R.id.itemTitle)
            itemDetails = itemView.findViewById(R.id.itemDetail)

        }
    }


}