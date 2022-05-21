package com.example.practica_semana_16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Ejemplo_for : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejemplo_for)

        val Texview = findViewById(R.id.texfor) as TextView

        val botton = findViewById(R.id.btfor) as Button
        botton.setOnClickListener{
            for(num in 1..5){
                Texview.setText("Numbero: $num\n")

            }

        }
    }

    }
