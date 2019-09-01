package com.example.data.local.source

import com.example.data.local.database.JobsDao
import com.example.data.local.mapper.AndroidJobCacheMapper
import com.example.data.local.mapper.AndroidJobCacheMapper.map
import com.example.domain.entities.AndroidJob
import io.reactivex.Single

class JobsCacheSourceImpl(private val jobsDao: JobsDao): JobsCacheDataSource {
    override fun getJobs(): Single<List<AndroidJob>> {
        return jobsDao.getJobs().map { map(it) }
    }

    override fun insertData(list: List<AndroidJob>) {
        return jobsDao.insertAll(AndroidJobCacheMapper.mapJobsToCache(list))
    }

    override fun updateData(list: List<AndroidJob>) {
        return jobsDao.updateData(AndroidJobCacheMapper.mapJobsToCache(list))
    }
}