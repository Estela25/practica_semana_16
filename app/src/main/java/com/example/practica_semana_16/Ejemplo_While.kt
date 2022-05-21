package com.example.practica_semana_16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Ejemplo_While : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejemplo_while)

        val mostar = findViewById(R.id.tvResu) as TextView
        val mostar2 = findViewById(R.id.tvResu2) as TextView

        val btResul = findViewById(R.id.btWhile) as Button
        btResul.setOnClickListener{
            var dia = 1
            while (dia < 6){
                if(dia == 1){
                    mostar.setText("$dia dia trabajando")
                }else{
                    mostar2.setText("$dia dias trabajando")
                }
               dia++
            }
        }

    }
}