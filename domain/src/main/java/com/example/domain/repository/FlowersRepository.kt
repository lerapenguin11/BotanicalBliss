package com.example.domain.repository

import com.example.domain.entities.Articles

interface FlowersRepository {

    fun getTopArticles(top : MutableList<Articles>) : MutableList<Articles>
}