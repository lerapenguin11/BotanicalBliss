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
import com.example.botanicalbliss.presentation.listener.ArticlesListener
import com.example.domain.entities.Articles

class ArticlesAdapter(private val listener : ArticlesListener) : RecyclerView.Adapter<ArticlesAdapter.ArticlesViewHolder>() {

    val articlesList = mutableListOf<Articles>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticlesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_articles, parent, false)

        return ArticlesViewHolder(view)
    }

    override fun getItemCount(): Int = articlesList.size

    override fun onBindViewHolder(holder: ArticlesViewHolder, position: Int) {
        val articles : Articles = articlesList[position]

        holder.title.text = articles.title
        Glide.with(holder.itemView)
            .load(articles.icon)
            .into(holder.icon)
        holder.itemView.setOnClickListener { listener.getArticlesListener(articles) }
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setItem(topArt : List<Articles>){
        articlesList.clear()
        articlesList.addAll(topArt)
        notifyDataSetChanged()
    }

    class ArticlesViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val icon : ImageView = view.findViewById(R.id.ic_articles)
        val title : TextView = view.findViewById(R.id.tv_art_title)
    }
}