package com.example.recyclerviewtest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(private val newsList :ArrayList<News>) : RecyclerView.Adapter<MyAdapter.MyViewHolder> {






    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return MyViewHolder(itemView)


    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {

        newsList.size
    }


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

         val titleImage: ShapeableImageView = itemView.findViewById(R.id.title_image)
         val tvHeading: TextView = itemView.findViewById(R.id.tvHeading)


    }




}

