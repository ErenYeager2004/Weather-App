package com.example.myapplication.viewmodel

import androidx.lifecycle.ViewModel
import com.example.myapplication.repository.WeatherRepository
import com.example.myapplication.server.ApiClient
import com.example.myapplication.server.ApiServices
import retrofit2.create

class WeatherViewModel(val repository: WeatherRepository):ViewModel() {
    constructor():this(WeatherRepository(ApiClient().getClient().create(ApiServices::class.java)))

    fun loadCurrentWeather(lat:Double,lng:Double,unit:String)=
        repository.getCurrentWeather(lat,lng,unit)
}
