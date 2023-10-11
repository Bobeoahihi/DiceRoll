package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButtonMA: Button = findViewById(R.id.button_AM)
        rollButtonMA.setOnClickListener {
            rollDiceMA()
        }
    }

    private fun rollDiceMA() {
        val diceMA = DiceMA(6)
        val dice2 = DiceMA(6)
        val cubeRoll = diceMA.rollMA()
        val cubeRoll2 = dice2.rollMA()
        val diceImage: ImageView = findViewById(R.id.imageView)
        val diceImage2: ImageView = findViewById(R.id.imageView2)

        when(cubeRoll) {
            1 -> diceImage.setImageResource(R.drawable.dice1)
            2 -> diceImage.setImageResource(R.drawable.dice2)
            3 -> diceImage.setImageResource(R.drawable.dice3)
            4 -> diceImage.setImageResource(R.drawable.dice4)
            5 -> diceImage.setImageResource(R.drawable.dice5)
            6 -> diceImage.setImageResource(R.drawable.dice6)

        }
        when(cubeRoll2) {
            1 -> diceImage2.setImageResource(R.drawable.dice1)
            2 -> diceImage2.setImageResource(R.drawable.dice2)
            3 -> diceImage2.setImageResource(R.drawable.dice3)
            4 -> diceImage2.setImageResource(R.drawable.dice4)
            5 -> diceImage2.setImageResource(R.drawable.dice5)
            6 -> diceImage2.setImageResource(R.drawable.dice6)

        }
    }

    class DiceMA (val numSidesMA: Int) {
        fun rollMA(): Int {
            return(1..numSidesMA).random()
        }
    }
}