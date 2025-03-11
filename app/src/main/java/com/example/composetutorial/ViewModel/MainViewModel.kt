package com.example.composetutorial.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.composetutorial.Domain.BannerModel
import com.example.composetutorial.Repository.MainRepository

class MainViewModel: ViewModel() {
    private val repository=MainRepository()

    fun loadBanner(): LiveData<MutableList<BannerModel>>{
        return repository.loadBanner()
    }
}