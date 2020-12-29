package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton : Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{
            rollDice()
        }
        val countUpButton : Button = findViewById(R.id.count_up_button)
        countUpButton.setOnClickListener{
            countUp()
        }
    }

    private fun rollDice() {
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.result_text)
        val randomInt = (1..6).random()
        resultText.text = randomInt.toString()
    }

    private fun countUp() {
        Toast.makeText(this, "countUp button clicked", Toast.LENGTH_SHORT).show()
        val countText: TextView = findViewById(R.id.result_text)
        if (countText.text == "Hello World!") {
            countText.text = 1.toString()
        }
        else {
            var count: Int = countText.text.toString().toInt()
            if (count < 6) {
                count += 1
                countText.text = count.toString()
            }
        }
    }
}