package com.example.botanicalbliss.di

import com.example.domain.usecase.GetTopArticlesUseCase
import org.koin.dsl.module

val domainModule = module {

    factory<GetTopArticlesUseCase> { GetTopArticlesUseCase(
        repository = get()
    ) }
}