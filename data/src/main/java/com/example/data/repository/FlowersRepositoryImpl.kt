package com.example.data.repository

import com.example.domain.entities.Articles
import com.example.domain.repository.FlowersRepository

class FlowersRepositoryImpl(
    private val dataSourceImpl: FlowersDataSource)
    : FlowersRepository {

    override fun getTopArticles(top: MutableList<Articles>): MutableList<Articles> {
        return dataSourceImpl.getTopArticles(top = top)
    }
}