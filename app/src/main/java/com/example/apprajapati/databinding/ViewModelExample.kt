package com.example.apprajapati.databinding

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.apprajapati.databinding.data.WeatherViewModel
import com.example.apprajapati.databinding.databinding.ViewModelExampleBinding

class ViewModelExample: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val myDataModel: WeatherViewModel by viewModels()
        val binding: ViewModelExampleBinding = DataBindingUtil.setContentView(this, R.layout.view_model_example)

        binding.weather = myDataModel

        binding.lifecycleOwner = this
        // this code will make sure that view model is aware of when the activity is running or not, so changes
        // to livedata don't try to update activity that isn't running.
    }
}