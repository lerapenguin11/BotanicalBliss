package com.example.botanicalbliss

import com.example.domain.entities.Articles

object Constants{

    fun getTopArticles() : MutableList<Articles>{
        var topArticlesList = mutableListOf<Articles>()

        val top1 = Articles(0, "fdgdff", "dfvfdbfbfgbb", "https://pixelbox.ru/wp-content/uploads/2021/09/minimal-background-instagram-72-scaled.jpg")
        topArticlesList.add(top1)

        return topArticlesList
    }

}