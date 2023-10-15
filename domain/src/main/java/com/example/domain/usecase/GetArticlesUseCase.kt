package com.example.domain.usecase

import com.example.domain.entities.Articles
import com.example.domain.repository.FlowersRepository

class GetArticlesUseCase (private val repository: FlowersRepository){

    operator fun invoke(art: MutableList<Articles>) = repository.getArticles(art = art)
}