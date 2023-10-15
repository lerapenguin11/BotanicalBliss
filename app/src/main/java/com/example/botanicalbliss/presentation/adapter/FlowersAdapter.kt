package com.example.botanicalbliss.presentation.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.botanicalbliss.R
import com.example.domain.entities.Flowers

class FlowersAdapter : RecyclerView.Adapter<FlowersAdapter.FlowersViewHolder>() {

    val flowersList = mutableListOf<Flowers>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlowersViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_flowers, parent, false)

        return FlowersViewHolder(view)
    }

    override fun getItemCount(): Int = flowersList.size

    override fun onBindViewHolder(holder: FlowersViewHolder, position: Int) {
        val flowers : Flowers = flowersList[position]

        holder.title.text = flowers.title
        Glide.with(holder.itemView)
            .load(flowers.icon)
            .into(holder.icon)
        holder.desc.text = flowers.text
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setItem(list : List<Flowers>){
        flowersList.clear()
        flowersList.addAll(list)
        notifyDataSetChanged()
    }

    class FlowersViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val icon : ImageView = view.findViewById(R.id.ic_flowers)
        val title : TextView = view.findViewById(R.id.rv_title_flowers)
        val desc : TextView = view.findViewById(R.id.tv_flowers_desc)
    }
}