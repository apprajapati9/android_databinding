package com.example.apprajapati.databinding

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.apprajapati.databinding.data.SampleWeatherData

class SimpleDataBindingExample: AppCompatActivity() {

    val myWeather =SampleWeatherData(30, "Rainy", 5, "C")

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }
}