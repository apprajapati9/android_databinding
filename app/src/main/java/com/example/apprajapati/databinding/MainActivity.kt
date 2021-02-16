package com.example.apprajapati.databinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

object TestData{
    const val temp = 38
    const val conditions ="Sunny"
    const val windchill = 6
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<TextView>(R.id.currenttemp).setText("${TestData.temp}")
        findViewById<TextView>(R.id.curcond).setText(TestData.conditions)
        findViewById<TextView>(R.id.windchill).setText("${TestData.windchill}")

        findViewById<Button>(R.id.simplebind).setOnClickListener{
            startActivity(Intent(this, SimpleDataBindingExample::class.java))
        }

        findViewById<Button>(R.id.obsfldbind).setOnClickListener{
            startActivity(Intent(this, ObservableFields::class.java))
        }

        findViewById<Button>(R.id.viewmodeldbind).setOnClickListener{
            startActivity(Intent(this, ViewModelExample::class.java))
        }

        findViewById<Button>(R.id.btnTwoWayBind).setOnClickListener{
            startActivity(Intent(this, TwoWayDataBinding::class.java))
        }

    }
}