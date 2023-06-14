package com.example.exemplo_intent

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var HomeFragment: HomeFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonVoltar: View = findViewById<Button>(R.id.Voltarbutao)
        val button = findViewById<Button>(R.id.buttonComecar)
        val buttonMangeli = findViewById<Button>(R.id.mangelibutton)
        HomeFragment = HomeFragment()

        button.setOnClickListener {
            val pagina2 = Intent(this@MainActivity, questao1::class.java)
            startActivity(pagina2)
        }

        buttonMangeli.setOnClickListener {
            setFragment(HomeFragment)
            buttonVoltar.visibility = View.VISIBLE
        }

        buttonVoltar.setOnClickListener {
            fechar(HomeFragment)
            buttonVoltar.visibility = View.INVISIBLE
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