package com.example.exemplo_intent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class questao6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.questao6)

        val buttonA = findViewById<Button>(R.id.buttonA)
        val buttonB = findViewById<Button>(R.id.buttonB)
        val buttonC = findViewById<Button>(R.id.buttonC)
        val buttonD = findViewById<Button>(R.id.buttonD)
        val buttonE = findViewById<Button>(R.id.buttonE)

        buttonA.setOnClickListener{
            Variaveis.potencia++
            val quero_esse = Intent(this@questao6, resultado::class.java)
            startActivity(quero_esse)
        }
        buttonB.setOnClickListener{
            Variaveis.beleza++
            val quero_esse = Intent(this@questao6, resultado::class.java)
            startActivity(quero_esse)
        }
        buttonC.setOnClickListener{
            Variaveis.custo_beneficio++
            val quero_esse = Intent(this@questao6, resultado::class.java)
            startActivity(quero_esse)
        }
        buttonD.setOnClickListener{
            Variaveis.ze_da_manga++
            val quero_esse = Intent(this@questao6, resultado::class.java)
            startActivity(quero_esse)
        }
        buttonE.setOnClickListener{
            Variaveis.arraza_role++
            val quero_esse = Intent(this@questao6, resultado::class.java)
            startActivity(quero_esse)
        }

    }
}