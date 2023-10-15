package com.example.data.repository

import com.example.domain.entities.Articles
import com.example.domain.entities.Flowers
import com.example.domain.entities.Photo
import com.example.domain.repository.FlowersRepository

class FlowersRepositoryImpl(
    private val dataSourceImpl: FlowersDataSource)
    : FlowersRepository {

    override fun getTopArticles(top: MutableList<Articles>): MutableList<Articles> {
        return dataSourceImpl.getTopArticles(top = top)
    }

    override fun getPhoto(photo: MutableList<Photo>): MutableList<Photo> {
        return dataSourceImpl.getPhoto(photo = photo)
    }

    override fun getFlowers(flowers: MutableList<Flowers>): MutableList<Flowers> {
        return dataSourceImpl.getFlowers(flowers = flowers)
    }
}