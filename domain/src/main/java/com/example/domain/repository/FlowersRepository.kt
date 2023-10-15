package com.example.domain.repository

import com.example.domain.entities.Articles
import com.example.domain.entities.Photo

interface FlowersRepository {

    fun getTopArticles(top : MutableList<Articles>) : MutableList<Articles>

    fun getPhoto(photo : MutableList<Photo>) : MutableList<Photo>
}