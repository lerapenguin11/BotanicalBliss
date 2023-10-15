package com.example.botanicalbliss.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.botanicalbliss.Constants
import com.example.domain.entities.Articles
import com.example.domain.usecase.GetTopArticlesUseCase
import kotlinx.coroutines.launch

class FlowersViewModel(
    private val getTopArticlesUseCase: GetTopArticlesUseCase
) : ViewModel(){

    fun getTopArticle(): MutableList<Articles> {
        var mutableData = mutableListOf<Articles>()
        viewModelScope.launch{
            mutableData = getTopArticlesUseCase.invoke(Constants.getTopArticles())
        }

        return mutableData
    }
}