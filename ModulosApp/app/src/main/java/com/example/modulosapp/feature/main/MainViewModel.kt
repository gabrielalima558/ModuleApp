package com.example.modulosapp.feature.main

import androidx.lifecycle.MutableLiveData
import com.example.modulosapp.feature.viewmodel.BaseViewModel

class MainViewModel: BaseViewModel() {
    val showAndroidJobsLiveData = MutableLiveData<Boolean>()
    val outAppLiveData = MutableLiveData<Boolean>()

    fun onShowAndroidJobsRequire() {
        showAndroidJobsLiveData.postValue(true)
    }

    fun onOutAppLiveData() {
        outAppLiveData.postValue(true)
    }
}