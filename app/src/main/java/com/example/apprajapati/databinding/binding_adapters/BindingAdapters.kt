package com.example.apprajapati.databinding.binding_adapters

import android.animation.ArgbEvaluator
import android.graphics.Color
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import com.example.apprajapati.databinding.R

/*
https://developer.android.com/topic/libraries/data-binding/binding-adapters to learn more about Binding adapters
 */

/*
warning example : Warning:Application namespace for attribute app:hideIfZero will be ignored.

 adding app: attribute throws warnings, to avoid that you should use either android: prefix or no prefix at all
 the use of prefix android:hideIfZero is encouraged and tip, create a new attribute only when you need it and not available built in
 */
@BindingAdapter("android:hideIfZero")
fun hideIfZero(view: View, value: Int){
    view.visibility =  if(value > 0) View.VISIBLE else View.GONE
}

@BindingAdapter("android:disableButtonAtZeroWindchill")
fun disableButtonIfWindichillZero(view: Button, value: Int){
    var switch = true
    if(value == 0) {
        switch = false
    }
    view.isEnabled = switch
    view.isClickable = switch
}

@BindingAdapter("android:textColor")
fun tempColor(view: TextView, value: Int){
    val color = ArgbEvaluator().evaluate(value.toFloat()/50f, Color.parseColor("#FF3700B3"),
                Color.parseColor("#ffcc0000")) as Int
    view.setTextColor(color)
}