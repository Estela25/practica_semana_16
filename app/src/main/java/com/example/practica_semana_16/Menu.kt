package com.example.practica_semana_16

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)


        val btn1=findViewById(R.id.btnMain) as Button
        btn1.setOnClickListener{
          val Lanzar= (Intent(this,MainActivity::class.java))
            startActivity(Lanzar)
        }

        val btn2=findViewById(R.id.btnIf) as Button
        btn2.setOnClickListener{
            val Lanzar= (Intent(this,Ejemplo_IF::class.java))
            startActivity(Lanzar)
        }

        val btn3=findViewById(R.id.btnFor) as Button
        btn3.setOnClickListener{
            val Lanzar= (Intent(this,Ejemplo_for::class.java))
            startActivity(Lanzar)
        }

        val btn4=findViewById(R.id.btnWhile) as Button
        btn4.setOnClickListener{
            val Lanzar= (Intent(this,Ejemplo_While::class.java))
            startActivity(Lanzar)
        }

        val btn5=findViewById(R.id.btnForeach) as Button
        btn5.setOnClickListener{
            val Lanzar= (Intent(this,Ejemplo_foreach::class.java))
            startActivity(Lanzar)
        }

        val btn6=findViewById(R.id.btnFunciones) as Button
        btn6.setOnClickListener{
            val Lanzar= (Intent(this,Ejemplo_Funciones::class.java))
            startActivity(Lanzar)
        }

        val btn7=findViewById(R.id.btnRango) as Button
        btn7.setOnClickListener{
            val Lanzar= (Intent(this,Ejemplo_Rango::class.java))
            startActivity(Lanzar)
        }

    }
}