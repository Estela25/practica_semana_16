package com.example.practica_semana_16
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Ejemplo_IF : AppCompatActivity() {


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejemplo_if)

        val resultado = findViewById(R.id.btMost) as Button
        resultado.setOnClickListener {
            val dinero = findViewById(R.id.etIngresar) as EditText
            val dinero2 = Integer.parseInt(dinero.toString())
            val txtresultado = findViewById(R.id.txtMostrar) as TextView
            if (dinero2 == 3){
                txtresultado.setText("Puedes comprar un pan")
            }else if(dinero2 < 3 && dinero2 > 0){
                txtresultado.setText("solo puedes comprar un dulce")
            }else if(dinero2==0){
                txtresultado.setText("No puedes comprar nada")
            }else{
                txtresultado.setText("Puedes comprar dulces y pan")
            }
        }
    }

    fun comprarpan(){


    }

}