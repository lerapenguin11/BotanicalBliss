package com.example.data.repository

import com.example.domain.entities.Articles
import com.example.domain.entities.Photo

interface FlowersDataSource {

    fun getTopArticles(top: MutableList<Articles>) : MutableList<Articles>

    fun getPhoto(photo : MutableList<Photo>) : MutableList<Photo>
}