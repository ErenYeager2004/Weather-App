package com.example.myapplication.repository

import com.example.myapplication.server.ApiServices

class WeatherRepository(val api:ApiServices) {
    fun getCurrentWeather(lat:Double,lng:Double,unit:String)=
        api.getCurrentWeather(lat,lng,unit,"3b86facc9c739dc6af427b125f6087ea")

}
