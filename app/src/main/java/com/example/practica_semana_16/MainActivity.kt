package com.example.practica_semana_16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

// creacipn de las fiunciones
data class Perfiles (val nombre:String, val usuario:String)
//crear los campos que se necesiten

class MainActivity : AppCompatActivity() {
    // creacion de variables de la pantalla
    val Integrante1 = Perfiles(nombre = "Eduardo", usuario = "eduardo")
    val Integrante2 = Perfiles(nombre = "Miguel", usuario = "Migel")
    var Integrante = Integrante1.copy()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //creacion de procesos, llamada de funcion

        val txt=findViewById(R.id.txtINT) as TextView
        //txt.setText("Hola soy Katerin")


        val boton=findViewById (R.id.btnCambiar) as Button
        boton.setOnClickListener{
            view -> CambiarIntegrante(Integrante)
        }




    }
    //creacion de
    fun VerPantalla(s:String){
        val txt=findViewById(R.id.txtINT) as TextView
        txt.setText(s)
    }
    fun CambiarIntegrante(perfiles: Perfiles){
    Integrante = perfiles.copy()
        when (perfiles.usuario){
            "Integrante1"-> Integrante = Integrante1.copy()
            "Integrante2"-> Integrante = Integrante2.copy()
            else -> print("Ya no hay integrantes")
        }
        VerPantalla("Red social de: ${Integrante.nombre} en faceboo.com/ ${Integrante.usuario}")
    }
}