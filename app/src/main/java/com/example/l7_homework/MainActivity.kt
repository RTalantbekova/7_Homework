package com.example.l7_homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var buttonOak : Button? = null
    var buttonCactus : Button? = null
    var buttonRose : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        InitViews()
        InitOnClicks()

        }

    private fun InitViews ()
    {
        buttonOak = findViewById<Button>(R.id.firstPlants)
        buttonCactus = findViewById<Button>(R.id.secondPlants)
        buttonRose = findViewById<Button>(R.id.thirdPlants)
    }

    private fun InitOnClicks ()
    {
        buttonOak?.setOnClickListener {
            val oak = OAK()
            Toast.makeText(applicationContext, oak.grow("Oak"), Toast.LENGTH_LONG).show()
        }

        buttonCactus?.setOnClickListener {
            val cactus = CACTUS()
            Toast.makeText(applicationContext, cactus.grow("Cactus"), Toast.LENGTH_LONG).show()
        }

        buttonRose?.setOnClickListener {
            val rose = ROSE()
            Toast.makeText(applicationContext, rose.grow("Rose"), Toast.LENGTH_LONG).show()
        }
    }
}