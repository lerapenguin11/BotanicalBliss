package com.example.domain.usecase

import com.example.domain.entities.Articles
import com.example.domain.repository.FlowersRepository

class GetTopArticlesUseCase(private val repository: FlowersRepository) {

    operator fun invoke(top: MutableList<Articles>) = repository.getTopArticles(top = top)
}