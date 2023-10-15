package com.example.data.repository

import com.example.domain.entities.Articles

class FlowersDataSourceImpl : FlowersDataSource {

    override fun getTopArticles(top: MutableList<Articles>): MutableList<Articles> {
        val mutableData = mutableListOf<Articles>()
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
        //mutableData.value = list

        return list
    }
}