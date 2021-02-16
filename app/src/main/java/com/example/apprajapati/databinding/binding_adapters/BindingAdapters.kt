package com.example.apprajapati.databinding.binding_adapters

import android.view.View
import androidx.databinding.BindingAdapter

@BindingAdapter("app:hideIfZero")
fun hideIfZero(view: View, value: Int){
    view.visibility =  if(value > 0) View.VISIBLE else View.GONE
}

@BindingAdapter("app:disableButtonAtZeroWindchill")
fun disableButtonIfWindichillZero(view: View, value: Int){
    var switch = true
    if(value == 0) {
        switch = false

    }
    view.isEnabled = switch
    view.isClickable = switch
}