package com.example.apprajapati.databinding.data

data class SampleWeatherData(
    val temp: Int,
    val conditions: String,
    val windChild:Int,
    val units: String) {

    fun convertToF(): Int{
        return (temp * 9/5) + 32

        //you can directly do in XML layout android:text="@{String.valueOf((weather.temp * 9/5)+32)}" ,
        //but you can also call a function from data variable so this is an example
        // which now can be written as android:text="@{String.valueOf(weather.convertToF())}" in XML file
        // in XML you don't need function () to add, you can simply write .. weather.convertToF
    }

    fun formatTemp(): String{
        //return temp.toString()+ "C" + " " +"("+ convertToF()+"F)"

        // which can be written as follows

        return "${temp}C (${convertToF()}F)" //in kotlin you can access variable like that.
    }
}