package com.example.composetutorial.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.composetutorial.Domain.BannerModel
import com.example.composetutorial.Domain.CategoryModel
import com.example.composetutorial.Domain.FoodModel
import com.example.composetutorial.Repository.MainRepository

class MainViewModel: ViewModel() {
    private val repository=MainRepository()

    fun loadBanner(): LiveData<MutableList<BannerModel>>{
        return repository.loadBanner()
    }

    fun loadCategory():LiveData<MutableList<CategoryModel>>{
        return repository.loadCategory()
    }

    fun loadFiltered(id:String):LiveData<MutableList<FoodModel>>{
        return repository.loadFiltered(id)
    }
}