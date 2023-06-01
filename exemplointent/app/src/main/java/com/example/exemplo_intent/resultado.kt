package com.example.exemplo_intent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.resultado)
        val buttonVoltar = findViewById<Button>(R.id.buttonVoltar)

        val textorespostaP:TextView = findViewById(R.id.potencia)
        textorespostaP.text = "${Variaveis.potencia}"
        val textorespostaB:TextView = findViewById(R.id.beleza)
        textorespostaB.text = "${Variaveis.beleza}"
        val textorespostaC:TextView = findViewById(R.id.custo_beneficio)
        textorespostaC.text = "${Variaveis.custo_beneficio}"
        val textorespostaZ:TextView = findViewById(R.id.ze_da_manga)
        textorespostaZ.text = "${Variaveis.ze_da_manga}"
        val textorespostaA:TextView = findViewById(R.id.arraza_role)
        textorespostaA.text = "${Variaveis.arraza_role}"

        buttonVoltar.setOnClickListener{
            Variaveis.potencia = 0
            Variaveis.beleza = 0
            Variaveis.custo_beneficio = 0
            Variaveis.ze_da_manga = 0
            Variaveis.arraza_role = 0
            val quero_esse = Intent(this@resultado, MainActivity::class.java)
            startActivity(quero_esse)
        }
    }
}