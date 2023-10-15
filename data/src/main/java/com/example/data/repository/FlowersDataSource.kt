package com.example.data.repository

import com.example.domain.entities.Articles

interface FlowersDataSource {

    fun getTopArticles(top: MutableList<Articles>) : MutableList<Articles>
}