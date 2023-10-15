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
import com.example.domain.entities.Articles

class TopArticleAdapter : RecyclerView.Adapter<TopArticleAdapter.TopArticleViewHolder>() {

    val topList = mutableListOf<Articles>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopArticleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_top_art, parent, false)

        return TopArticleViewHolder(view)
    }

    override fun getItemCount(): Int = topList.size

    override fun onBindViewHolder(holder: TopArticleViewHolder, position: Int) {
        val top : Articles = topList[position]

        holder.title.text = top.title
        Glide.with(holder.itemView)
            .load(top.icon)
            .into(holder.icon)
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setItem(topArt : List<Articles>){
        topList.clear()
        topList.addAll(topArt)
        notifyDataSetChanged()
    }

    class TopArticleViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val icon : ImageView = view.findViewById(R.id.ic_top_art)
        val title : TextView = view.findViewById(R.id.tv_top_art)
    }
}