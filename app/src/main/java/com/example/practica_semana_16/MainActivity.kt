package com.example.practica_semana_16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


data class Perfiles (val nombre:String, val usuario:String)


class MainActivity : AppCompatActivity() {

    val Integrante1 = Perfiles(nombre = "Luis", usuario = "Luis")
    val Integrante2 = Perfiles(nombre = "Rigoberto", usuario = "Rigoberto")
    var Integrante = Integrante1.copy()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val txt=findViewById(R.id.txtINT) as TextView



        val boton=findViewById (R.id.btnCambiar) as Button
        boton.setOnClickListener{
            view -> CambiarIntegrante(Integrante)
        }




    }

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