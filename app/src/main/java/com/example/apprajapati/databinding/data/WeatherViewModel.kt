package com.example.apprajapati.databinding.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

// https://developer.android.com/topic/libraries/architecture/viewmodel to read about ViewModel,
/*
    It is basically aware of application lifecycle so prevents the loss of data in case of recreation of data ie.
    when you rotate your screen , activity is recreated and data is reset, but viewmodel will save the data independenly
    from app lifecycle so populated data won't be destroyed / reset

 */
class WeatherViewModel: ViewModel() {
    // Usually this data comes from a service that provides data but here it is hard coded

    private val _current_temp =MutableLiveData(30)
    private val _current_conditions =MutableLiveData("Cloudy")
    private val _current_windchill = MutableLiveData(0)

    val current_temp : MutableLiveData<Int> = _current_temp
    val current_conditions: LiveData<String> = _current_conditions
    val current_windchill: LiveData<Int> = _current_windchill

    fun incrementTemp(){
        _current_temp.value = _current_temp.value?.plus(1)
    }

    fun decreaseTemp(){
        _current_temp.value = _current_temp.value?.minus(1)
    }
}