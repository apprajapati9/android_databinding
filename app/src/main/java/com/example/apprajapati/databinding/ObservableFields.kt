package com.example.apprajapati.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt
import com.example.apprajapati.databinding.data.ObservableWeatherData
import com.example.apprajapati.databinding.databinding.ObservableDatabindingLayoutBinding

class ObservableFields: AppCompatActivity() {

    private val observable_weather = ObservableWeatherData( ObservableInt(30),
                ObservableField<String>("Cloudy"),
                ObservableInt(5))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ObservableDatabindingLayoutBinding = DataBindingUtil.setContentView(this, R.layout.observable_databinding_layout)
        binding.weather = observable_weather
    }
}