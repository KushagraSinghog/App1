package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.slider.Slider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val button = findViewById<AppCompatButton>(R.id.Button)
        button.setOnClickListener {
            val weight = findViewById<Slider>(R.id.weightSlider).value
            val height = findViewById<Slider>(R.id.heightSlider).value
            val heightm = height / 100
            val bmi = weight / (heightm * heightm)
            val answer = findViewById<TextView>(R.id.answer)
            answer.text = bmi.toString()

        }
    }
}