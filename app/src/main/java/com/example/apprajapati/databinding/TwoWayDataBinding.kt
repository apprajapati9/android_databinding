package com.example.apprajapati.databinding

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.apprajapati.databinding.data.WeatherViewModel
import com.example.apprajapati.databinding.databinding.TwoWayDataBindingBinding

class TwoWayDataBinding: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val myDataModel: WeatherViewModel by viewModels()
        val binding: TwoWayDataBindingBinding = DataBindingUtil.setContentView(this, R.layout.two_way_data_binding)
        binding.weather = myDataModel

        binding.lifecycleOwner = this
    }

}