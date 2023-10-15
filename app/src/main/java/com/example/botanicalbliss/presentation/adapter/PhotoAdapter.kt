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
import com.example.domain.entities.Photo

class PhotoAdapter : RecyclerView.Adapter<PhotoAdapter.PhotoViewHolder>() {

    val photoList = mutableListOf<Photo>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_photo, parent, false)

        return PhotoViewHolder(view)
    }

    override fun getItemCount(): Int = photoList.size

    override fun onBindViewHolder(holder: PhotoViewHolder, position: Int) {
        val photo : Photo = photoList[position]

        holder.title.text = photo.tag
        Glide.with(holder.itemView)
            .load(photo.icon)
            .into(holder.icon)
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setItem(list : List<Photo>){
        photoList.clear()
        photoList.addAll(list)
        notifyDataSetChanged()
    }

    class PhotoViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val icon : ImageView = view.findViewById(R.id.ic_photo)
        val title : TextView = view.findViewById(R.id.tv_photo_tag)
    }
}