package com.example.botanicalbliss.di

import com.example.botanicalbliss.viewmodel.FlowersViewModel
import com.example.domain.usecase.GetArticlesUseCase
import com.example.domain.usecase.GetFlowersUseCase
import com.example.domain.usecase.GetPhotoUseCase
import com.example.domain.usecase.GetTopArticlesUseCase
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel<FlowersViewModel> {
        FlowersViewModel(
            getTopArticlesUseCase = GetTopArticlesUseCase(get()),
            getPhotoUseCase = GetPhotoUseCase(get()),
            getFlowersUseCase = GetFlowersUseCase(get()),
            getArticlesUseCase = GetArticlesUseCase(get())
        )
    }
}