package com.example.apprajapati.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.apprajapati.databinding.data.SampleWeatherData
import com.example.apprajapati.databinding.databinding.SimpleDatabindingExampleBindingImpl

class SimpleDataBindingExample: AppCompatActivity() {

    val myWeather = SampleWeatherData(30, "Rainy", 5, "C")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // This is how you set your layout using Data binding library
        val binding: SimpleDatabindingExampleBindingImpl = DataBindingUtil.setContentView(this, R.layout.simple_databinding_example)

        //As you can see, we have reduced signifanct amount of code that handles assigning values to each textview just by one single line.
        binding.weather = myWeather

    }
}