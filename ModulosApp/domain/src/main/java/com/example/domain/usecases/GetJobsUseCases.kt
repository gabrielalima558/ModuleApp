package com.example.domain.usecases

import com.example.domain.entities.AndroidJob
import io.reactivex.Scheduler
import com.example.domain.repository.AndroidJobsRepository
import io.reactivex.Single

class GetJobsUseCases(private val repository: AndroidJobsRepository,
                      private val scheduler: Scheduler) {

    fun execute(forceUpdate: Boolean): Single<List<AndroidJob>> {
        return repository.getJobs(forceUpdate)
            .subscribeOn(scheduler)
    }
}