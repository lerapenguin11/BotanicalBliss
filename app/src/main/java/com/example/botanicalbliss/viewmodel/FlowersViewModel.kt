package com.example.botanicalbliss.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.botanicalbliss.Constants
import com.example.domain.entities.Articles
import com.example.domain.entities.Flowers
import com.example.domain.entities.Photo
import com.example.domain.usecase.GetFlowersUseCase
import com.example.domain.usecase.GetPhotoUseCase
import com.example.domain.usecase.GetTopArticlesUseCase
import kotlinx.coroutines.launch

class FlowersViewModel(
    private val getTopArticlesUseCase: GetTopArticlesUseCase,
    private val getPhotoUseCase: GetPhotoUseCase,
    private val getFlowersUseCase: GetFlowersUseCase
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

    fun getFlowers(): MutableList<Flowers> {
        var mutableData = mutableListOf<Flowers>()
        viewModelScope.launch{
            mutableData = getFlowersUseCase.invoke(Constants.getFlowers())
        }

        return mutableData
    }
}