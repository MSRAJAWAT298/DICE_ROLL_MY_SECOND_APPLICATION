package com.example.dicerollmysecondapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{
            val number = rollDice()
            Log.i("MainActivity","Button  is clicked ! $number")

        }
    }

    private fun rollDice() {
        val randomInt = Random.nextInt(6)+1
        //Log.i("MainActivity","Button  is clicked ! $randomInt" )

    }
}