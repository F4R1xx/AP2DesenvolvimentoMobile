package com.example.exemplo_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.buttonComecar)

        button.setOnClickListener{
            val pagina2 = Intent(this@MainActivity, questao1::class.java)
            startActivity(pagina2)
        }
    }
}