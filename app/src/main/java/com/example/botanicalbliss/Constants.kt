package com.example.botanicalbliss

import com.example.domain.entities.Articles
import com.example.domain.entities.Flowers
import com.example.domain.entities.Photo

object Constants{

    fun getTopArticles() : MutableList<Articles>{
        var topArticlesList = mutableListOf<Articles>()

        val top1 = Articles(0, "fdgdff", "dfvfdbfbfgbb", "https://pixelbox.ru/wp-content/uploads/2021/09/minimal-background-instagram-72-scaled.jpg")
        topArticlesList.add(top1)

        return topArticlesList
    }

    fun getPhoto() : MutableList<Photo>{
        var topArticlesList = mutableListOf<Photo>()

        val top1 = Photo(0, "fdgdff", "https://pixelbox.ru/wp-content/uploads/2021/09/minimal-background-instagram-72-scaled.jpg")
        topArticlesList.add(top1)

        return topArticlesList
    }

    fun getFlowers() : MutableList<Flowers>{
        var topArticlesList = mutableListOf<Flowers>()

        val top1 = Flowers(0, "fdgdff", "fhfdfvhdfkjvdfjkv", 5,
            "https://pixelbox.ru/wp-content/uploads/2021/09/minimal-background-instagram-72-scaled.jpg")
        topArticlesList.add(top1)

        return topArticlesList
    }
}