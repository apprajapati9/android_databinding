package com.example.apprajapati.databinding.data

import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt

data class ObservableWeatherData(
    val current_temp: ObservableInt,
    val current_condition: ObservableField<String>,
    val current_windchill: ObservableInt
) {
    fun incrementTemp(){
        current_temp.set(current_temp.get()+1)
    }

    fun decreaseTemp(){
        current_temp.set(current_temp.get()-1)
    }
}