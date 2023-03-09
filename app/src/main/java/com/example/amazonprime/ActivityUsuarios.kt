package com.example.amazonprime

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityUsuarios : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuarios)

        findViewById<Button>(R.id.usuario1).setOnClickListener {
            var pasar_pagina = Intent(this, PaginaInicio::class.java )
            startActivity(pasar_pagina)
        }

        findViewById<Button>(R.id.usuario2).setOnClickListener {
            var pasar_pagina = Intent(this, PaginaInicio::class.java)
            startActivity(pasar_pagina)
        }

        findViewById<Button>(R.id.usuario3).setOnClickListener {
            var pasar_pagina = Intent(this, PaginaInicio::class.java)
            startActivity(pasar_pagina)
        }

        findViewById<Button>(R.id.usuario4).setOnClickListener {
            var pasar_pagina = Intent(this, PaginaInicio::class.java)
            startActivity(pasar_pagina)
        }

        findViewById<Button>(R.id.kids).setOnClickListener {
            var pasar_pagina = Intent(this, PaginaInicio::class.java)
            startActivity(pasar_pagina)
        }

    }
}