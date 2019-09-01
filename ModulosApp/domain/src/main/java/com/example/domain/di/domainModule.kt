package com.example.domain.di

import io.reactivex.schedulers.Schedulers
import com.example.domain.usecases.GetJobsUseCases
import org.koin.dsl.module

val useCaseModule = module {

    factory {
        GetJobsUseCases(
            repository = get(),
            scheduler = Schedulers.io()
        )
    }
}

val domainModule = listOf(useCaseModule)