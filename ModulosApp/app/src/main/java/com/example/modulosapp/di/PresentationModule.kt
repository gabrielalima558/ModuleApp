package com.example.modulosapp.di

import com.example.modulosapp.feature.list.AndroidJobListViewModel
import com.example.modulosapp.feature.list.AndroidJobsAdapter
import com.example.modulosapp.feature.main.MainViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val presentationModule = module {

    factory { AndroidJobsAdapter() }

    viewModel { MainViewModel() }

    viewModel { AndroidJobListViewModel(
        useCase = get(),
        uiScheduler = AndroidSchedulers.mainThread()
    )
    }
}