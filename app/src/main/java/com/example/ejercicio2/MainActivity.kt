package com.example.ejercicio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var tuResultado: TextView
    lateinit var imagenDato: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imagenDato = findViewById(R.id.imagenDado)
        tuResultado =findViewById(R.id.Numero)
    }
    //metodo especial para acciones
    fun lanzarDado(v: View) {

        val numeroAlAzar = Random.nextInt(6)+1
        val recurso = when(numeroAlAzar){
            1->{
                R.drawable.dice_1

            }
            2->{
                R.drawable.dice_2

            }
            3->{
                R.drawable.dice_3

            }
            4->{
                R.drawable.dice_4

            }
            5->{
                R.drawable.dice_5

            }
            else -> {
                R.drawable.dice_6

            }
        }
        tuResultado.text = "$numeroAlAzar"
        imagenDato.setImageResource(recurso)
    }
}