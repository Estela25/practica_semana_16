package com.example.practica_semana_16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Ejemplo_Rango : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejemplo_rango)
        val tv1=findViewById(R.id.tv1) as TextView
        val tv2=findViewById(R.id.tv2) as TextView
        val btn=findViewById(R.id.btRango) as Button

        btn.setOnClickListener{
            for(x in 'a'..'e'){
                tv1.setText("$x")
            }

            for(p in 'e' downTo 'a'){
                tv2.setText("$p")
            }
        }
    }
}