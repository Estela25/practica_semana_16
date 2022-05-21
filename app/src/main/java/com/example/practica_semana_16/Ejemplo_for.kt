package com.example.practica_semana_16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Ejemplo_for : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejemplo_for)

        val botton = findViewById(R.id.btfor) as Button
        botton.setOnClickListener{
            Main(args)

        }
    }
    fun Main (args:Array <String>){
        val Texview = findViewById(R.id.texfor) as TextView
for(i in 1..100 step 2){
    Texview.setText(i)

}
    }
}