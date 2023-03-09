package com.example.amazonprime

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PaginaInicio : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina_inicio)

        //botones que te llevan a la pagina correspondiente en cada "foto"
        findViewById<Button>(R.id.Todo).setOnClickListener{
            var cambio_pagina = Intent(this, nombrepaginasiguiente::class.java)
            startActivity(nombrepaginasiguiente)
        }

    }



}