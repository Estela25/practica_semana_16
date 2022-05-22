package com.example.practica_semana_16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Ejemplo_Funciones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejemplo_funciones)

        val n1=findViewById(R.id.txtN1) as EditText
        val n2=findViewById(R.id.txtN2) as EditText
        val r=findViewById(R.id.txtR) as TextView
        val sumar=findViewById(R.id.btnSumar) as Button

        sumar.setOnClickListener{
            r.setText(
                "la respuesta es: "+(n1.text.toString().toInt()+n2.text.toString().toInt())
            )
        }
    }
}