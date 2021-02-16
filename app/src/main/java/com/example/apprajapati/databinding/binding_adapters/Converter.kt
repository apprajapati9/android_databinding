package com.example.apprajapati.databinding.binding_adapters

object Converter{
    @JvmStatic
    fun tempToDescription(temp:Int) : String{
        return when {
            temp < 0 -> "Man, it's cold!"
            temp in 0..5 -> "Ohh, it's chilly!"
            temp in 6..10 -> "Cool, but not cold!"
            temp in 11..15 -> "Brisk but pleasant!"
            temp in 16..20 -> "Quite nice!"
            temp in 21..25 -> "A bit warm!"
            temp in 26..35 -> "Something of a scorcher!"
            else -> "You could fry an egg!!"
        }
    }
}