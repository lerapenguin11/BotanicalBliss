package com.example.data.repository

import com.example.domain.entities.Articles
import com.example.domain.entities.Flowers
import com.example.domain.entities.Photo

class FlowersDataSourceImpl : FlowersDataSource {

    override fun getTopArticles(top: MutableList<Articles>): MutableList<Articles> {
        val list = mutableListOf<Articles>()

        for (i in top){
            val id = i.id
            val title = i.title
            val description = i.text
            val icon = i.icon

            val listLetterModel = Articles(
                id = id, title = title, text = description, icon = icon)

            list.add(listLetterModel)
        }

        return list
    }

    override fun getPhoto(photo: MutableList<Photo>): MutableList<Photo> {
        val list = mutableListOf<Photo>()

        for (i in photo){
            val id = i.id
            val icon = i.icon
            val tag = i.tag

            val listLetterModel = Photo(
                id = id, icon = icon, tag = tag)

            list.add(listLetterModel)
        }

        return list
    }

    override fun getFlowers(flowers: MutableList<Flowers>): MutableList<Flowers> {
        val list = mutableListOf<Flowers>()

        for (i in flowers){
            val id = i.id
            val title = i.title
            val description = i.text
            val icon = i.icon
            val star = i.star

            val listLetterModel = Flowers(
                id = id, title = title, text = description, icon = icon, star = star)

            list.add(listLetterModel)
        }

        return list
    }

    override fun getArticles(art: MutableList<Articles>): MutableList<Articles> {
        val list = mutableListOf<Articles>()

        for (i in art){
            val id = i.id
            val title = i.title
            val description = i.text
            val icon = i.icon

            val listLetterModel = Articles(
                id = id, title = title, text = description, icon = icon)

            list.add(listLetterModel)
        }

        return list
    }
}