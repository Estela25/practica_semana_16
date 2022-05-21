package com.example.practica_semana_16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Ejemplo_foreach : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejemplo_foreach)

        val perrito = findViewById(R.id.tvPerro) as TextView
        val perrito2 = findViewById(R.id.tvPerro2) as TextView

        val chucho = findViewById(R.id.btPerro) as Button
        chucho.setOnClickListener{
            var perros = arrayOf("Monte","Chupacabras","Solovino","Tilin","Chiquito")

            for(i in perros.indices){
                perrito.setText("El perro ${i+1} es ${perros[i]}")
            }
            perros.forEach { perrito2.setText("El perro es $it") }
        }
    }
}