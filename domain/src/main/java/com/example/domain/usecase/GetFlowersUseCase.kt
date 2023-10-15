package com.example.domain.usecase

import com.example.domain.entities.Flowers
import com.example.domain.repository.FlowersRepository

class GetFlowersUseCase(private val repository: FlowersRepository) {

    operator fun invoke(flowers: MutableList<Flowers>) = repository.getFlowers(flowers = flowers)
}