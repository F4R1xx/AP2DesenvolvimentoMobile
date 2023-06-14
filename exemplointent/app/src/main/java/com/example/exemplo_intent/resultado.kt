package com.example.exemplo_intent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class resultado : AppCompatActivity() {
    private lateinit var HomeFragment: HomeFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.resultado)

        val buttonVoltarX: View = findViewById<Button>(R.id.VoltarbutaoX)
        val buttonVoltar = findViewById<Button>(R.id.buttonVoltar)
        val textoresposta: TextView = findViewById(R.id.Textinho)
        val imagemresposta: ImageView = findViewById(R.id.imagem)
        val buttonMangeli = findViewById<Button>(R.id.mangelibutton)
        HomeFragment = HomeFragment()

        if (Variaveis.potencia == 6) {
            textoresposta.text = "Bugatti"
            imagemresposta.setImageResource(R.drawable.bugatti)
        }
        if (Variaveis.potencia == 5) {
            if (Variaveis.beleza == 1) {
                textoresposta.text = "Ferrari 458"
                imagemresposta.setImageResource(R.drawable.ferrari)
            } else {
                textoresposta.text = "Lamborghini Gallardo"
                imagemresposta.setImageResource(R.drawable.lambo)
            }
        }
        if (Variaveis.potencia == 4) {
            textoresposta.text = "Lexus LFA"
            imagemresposta.setImageResource(R.drawable.lexus)
        }
        if (Variaveis.potencia == 3) {
            if (Variaveis.beleza >= 2) {
                textoresposta.text = "Golf GTI"
                imagemresposta.setImageResource(R.drawable.golf)
            } else if (Variaveis.custo_beneficio >= 2) {
                textoresposta.text = "Up TSI"
                imagemresposta.setImageResource(R.drawable.up)
            } else if (Variaveis.ze_da_manga >= 2) {
                textoresposta.text = "Renault Megane RS"
                imagemresposta.setImageResource(R.drawable.megane)
            } else {
                textoresposta.text = "Onix RS"
                imagemresposta.setImageResource(R.drawable.onix)
            }
        }
        if (Variaveis.potencia == 2) {
            if (Variaveis.custo_beneficio >= 3) {
                textoresposta.text = "Sandero RS"
                imagemresposta.setImageResource(R.drawable.sandero)
            } else if (Variaveis.ze_da_manga >= 3) {
                textoresposta.text = "Marea turbo"
                imagemresposta.setImageResource(R.drawable.marea)
            } else if (Variaveis.arraza_role >= 3) {
                textoresposta.text = "Essa coisa aqui..."
                imagemresposta.setImageResource(R.drawable.coisa)
            } else {
                textoresposta.text = "Peugeot 2008"
                imagemresposta.setImageResource(R.drawable.p2008)
            }
        }
        if (Variaveis.potencia == 1) {
            if (Variaveis.custo_beneficio >= 4) {
                textoresposta.text = "Renault Kwid"
                imagemresposta.setImageResource(R.drawable.kwid)
            } else if (Variaveis.ze_da_manga >= 4) {
                textoresposta.text = "Ta virando zé da manga..."
                imagemresposta.setImageResource(R.drawable.manga)
            } else if (Variaveis.beleza >= 4) {
                textoresposta.text = "Jaguar F PACE"
                imagemresposta.setImageResource(R.drawable.jaguar)
            } else if (Variaveis.arraza_role >= 4) {
                textoresposta.text = "Peugeot 206 TUNADO"
                imagemresposta.setImageResource(R.drawable.p206)
            } else {
                textoresposta.text = "Jeep RENEGADO"
                imagemresposta.setImageResource(R.drawable.jeep)
            }
        }
        if (Variaveis.potencia == 0) {
            if (Variaveis.beleza >= 4) {
                textoresposta.text = "Aston Martin Vantage Roadster"
                imagemresposta.setImageResource(R.drawable.aston)
            } else if (Variaveis.custo_beneficio >= 4) {
                textoresposta.text = "Vai de busão que compensa mais!"
                imagemresposta.setImageResource(R.drawable.onibus)
            } else if (Variaveis.ze_da_manga >= 5) {
                textoresposta.text = "Você é o ZÉ DA MANGA!"
                imagemresposta.setImageResource(R.drawable.cario)
            } else if (Variaveis.arraza_role >= 4) {
                textoresposta.text = "Carro de Baiano"
                imagemresposta.setImageResource(R.drawable.baiano)
            } else {
                textoresposta.text = "Você é um ser Humano"
                imagemresposta.setImageResource(R.drawable.humano)
            }
        }

        val buttonWeb = findViewById<Button>(R.id.buttonGIT)

        buttonWeb.setOnClickListener {
            val webpage =
                Uri.parse("https://github.com/F4R1xx/AP2DesenvolvimentoMobile/tree/main/exemplointent")
            val intent = Intent(Intent.ACTION_VIEW, webpage)
            startActivity(intent)
        }


        buttonMangeli.setOnClickListener {
            setFragment(HomeFragment)
            buttonVoltarX.visibility = View.VISIBLE
        }

        buttonVoltarX.setOnClickListener {
            fechar(HomeFragment)
            buttonVoltarX.visibility = View.INVISIBLE
        }

        //Butao para reiniciar!
        buttonVoltar.setOnClickListener {
            Variaveis.potencia = 0
            Variaveis.beleza = 0
            Variaveis.custo_beneficio = 0
            Variaveis.ze_da_manga = 0
            Variaveis.arraza_role = 0
            val quero_esse = Intent(this@resultado, MainActivity::class.java)
            startActivity(quero_esse)
        }
    }

    private fun setFragment(fragment: HomeFragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.FrameMangeli, fragment)
        fragmentTransaction.commit()
    }

    private fun fechar(fragment: HomeFragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.remove(HomeFragment)
        fragmentTransaction.commit()
    }
}