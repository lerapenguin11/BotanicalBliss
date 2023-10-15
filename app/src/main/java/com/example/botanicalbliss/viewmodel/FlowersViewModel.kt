package com.example.botanicalbliss.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.botanicalbliss.Constants
import com.example.domain.entities.Articles
import com.example.domain.entities.Photo
import com.example.domain.usecase.GetPhotoUseCase
import com.example.domain.usecase.GetTopArticlesUseCase
import kotlinx.coroutines.launch

class FlowersViewModel(
    private val getTopArticlesUseCase: GetTopArticlesUseCase,
    private val getPhotoUseCase: GetPhotoUseCase
) : ViewModel(){

    fun getTopArticle(): MutableList<Articles> {
        var mutableData = mutableListOf<Articles>()
        viewModelScope.launch{
            mutableData = getTopArticlesUseCase.invoke(Constants.getTopArticles())
        }

        return mutableData
    }

    fun getPhoto(): MutableList<Photo> {
        var mutableData = mutableListOf<Photo>()
        viewModelScope.launch{
            mutableData = getPhotoUseCase.invoke(Constants.getPhoto())
        }

        return mutableData
    }
}