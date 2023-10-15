package com.example.domain.usecase

import com.example.domain.entities.Photo
import com.example.domain.repository.FlowersRepository

class GetPhotoUseCase(private val repository: FlowersRepository) {

    operator fun invoke(photo: MutableList<Photo>) = repository.getPhoto(photo = photo)
}