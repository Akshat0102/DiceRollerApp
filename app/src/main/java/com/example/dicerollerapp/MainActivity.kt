package com.example.dicerollerapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener {

            val onClick = Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT).show()

            rollDice()

        }
    }

    private fun rollDice() {

        val diceRoll = (1..6).random()

        val diceImage: ImageView = findViewById(R.id.imageView)

        val drawableResource = when (diceRoll) {

            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }
        diceImage.setImageResource(drawableResource)  //updates Imageview with drawable resource id, even if you remove this it would work fine

        diceImage.contentDescription = diceRoll.toString()
    }
}