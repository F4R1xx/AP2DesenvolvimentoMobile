package com.example.exemplo_intent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.resultado)
        val buttonVoltar = findViewById<Button>(R.id.buttonVoltar)
        val textoresposta:TextView = findViewById(R.id.Textinho)
        val imagemresposta:ImageView = findViewById(R.id.imagem)

        if(Variaveis.potencia == 6){
            textoresposta.text = "Bugatti"
            imagemresposta.setImageResource(R.drawable.bugatti)
        }
        if(Variaveis.potencia == 5){
            if(Variaveis.beleza == 1){
                textoresposta.text = "Ferrari 458"
                imagemresposta.setImageResource(R.drawable.Ferrari)
            }
            else{
                textoresposta.text = "Lamborghini Gallardo"
                imagemresposta.setImageResource(R.drawable.Lambo)
            }
        }
        if(Variaveis.potencia == 4){
                textoresposta.text = "Lexus LFA"
            imagemresposta.setImageResource(R.drawable.Lexus)
        }
        if(Variaveis.potencia == 3){
            if(Variaveis.beleza >= 2){
                textoresposta.text = "Golf GTI"
                imagemresposta.setImageResource(R.drawable.Golf)
            }
            else if(Variaveis.custo_beneficio >= 2){
                textoresposta.text = "Up TSI"
                imagemresposta.setImageResource(R.drawable.Up)
            }
            else if(Variaveis.ze_da_manga >= 2){
                textoresposta.text = "Renault Megane RS"
                imagemresposta.setImageResource(R.drawable.Megane)
            }
            else{
                textoresposta.text = "Onix RS"
                imagemresposta.setImageResource(R.drawable.Onix)
            }
        }
        if(Variaveis.potencia == 2){
            if(Variaveis.custo_beneficio >= 3){
                textoresposta.text = "Sandero RS"
                imagemresposta.setImageResource(R.drawable.Sandero)
            }
            else if(Variaveis.ze_da_manga >= 3){
                textoresposta.text = "Marea turbo"
                imagemresposta.setImageResource(R.drawable.Marea)
            }
            else if(Variaveis.arraza_role >= 3){
                textoresposta.text = "Essa coisa aqui..."
                imagemresposta.setImageResource(R.drawable.Coisa)
            }
            else{
                textoresposta.text = "Peugeot 2008"
                imagemresposta.setImageResource(R.drawable.P2008)
            }
        }
        if(Variaveis.potencia == 1){
            if(Variaveis.custo_beneficio >= 4){
                textoresposta.text = "Renault Kwid"
                imagemresposta.setImageResource(R.drawable.Kwid)
            }
            else if(Variaveis.ze_da_manga >= 4){
                textoresposta.text = "Ta virando zé da manga..."
                imagemresposta.setImageResource(R.drawable.Manga)
            }
            else if(Variaveis.beleza >= 4){
                textoresposta.text = "Jaguar F PACE"
                imagemresposta.setImageResource(R.drawable.Jaguar)
            }
            else if(Variaveis.arraza_role >= 4){
                textoresposta.text = "Peugeot 206 TUNADO"
                imagemresposta.setImageResource(R.drawable.Ferrari)
            }
            else{
                textoresposta.text = "Jeep RENEGADO"
                imagemresposta.setImageResource(R.drawable.Jeep)
            }
        }
        if(Variaveis.potencia == 0){
            if(Variaveis.beleza >= 4){
                textoresposta.text = "Aston Martin Vantage Roadster"
                imagemresposta.setImageResource(R.drawable.Aston)
            }
            else if(Variaveis.custo_beneficio >= 4){
                textoresposta.text = "Vai de busão que compensa mais!"
                imagemresposta.setImageResource(R.drawable.Onibus)
            }
            else if(Variaveis.ze_da_manga >= 5){
                textoresposta.text = "Você é o ZÉ DA MANGA!"
                imagemresposta.setImageResource(R.drawable.Cario)
            }
            else if(Variaveis.arraza_role >= 4){
                textoresposta.text = "Carro de Baiano"
                imagemresposta.setImageResource(R.drawable.Baiano)
            }
            else{
                textoresposta.text = "Você é um ser Humano"
                imagemresposta.setImageResource(R.drawable.Humano)
            }
        }





        //Butao para reiniciar!
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