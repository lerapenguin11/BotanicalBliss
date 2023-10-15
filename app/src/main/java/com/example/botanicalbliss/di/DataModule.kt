package com.example.botanicalbliss.di

import com.example.data.repository.FlowersDataSource
import com.example.data.repository.FlowersDataSourceImpl
import com.example.data.repository.FlowersRepositoryImpl
import com.example.domain.repository.FlowersRepository
import org.koin.dsl.module

val dataModule = module {
    single<FlowersDataSource> { FlowersDataSourceImpl() }
    single<FlowersRepository> { FlowersRepositoryImpl(get()) }
}