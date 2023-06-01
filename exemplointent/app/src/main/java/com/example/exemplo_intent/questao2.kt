package com.example.exemplo_intent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity

class questao2 : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.questao2)


            val buttonA = findViewById<Button>(R.id.buttonA)
            val buttonB = findViewById<Button>(R.id.buttonB)
            val buttonC = findViewById<Button>(R.id.buttonC)
            val buttonD = findViewById<Button>(R.id.buttonD)
            val buttonE = findViewById<Button>(R.id.buttonE)

            buttonA.setOnClickListener{
                Variaveis.potencia = +1
                val quero_esse = Intent(this@questao2, questao3::class.java)
                startActivity(quero_esse)
            }
            buttonB.setOnClickListener{
                Variaveis.beleza = +1
                val quero_esse = Intent(this@questao2, questao3::class.java)
                startActivity(quero_esse)
            }
            buttonC.setOnClickListener{
                Variaveis.custo_beneficio = +1
                val quero_esse = Intent(this@questao2, questao3::class.java)
                startActivity(quero_esse)
            }
            buttonD.setOnClickListener{
                Variaveis.ze_da_manga = +1
                val quero_esse = Intent(this@questao2, questao3::class.java)
                startActivity(quero_esse)
            }
            buttonE.setOnClickListener{
                Variaveis.arraza_role = +1
                val quero_esse = Intent(this@questao2, questao3::class.java)
                startActivity(quero_esse)
            }

        }

    }