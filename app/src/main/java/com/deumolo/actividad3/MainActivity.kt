package com.deumolo.actividad3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    private lateinit var increaseBtn: Button
    private lateinit var decreaseBtn: Button
    private lateinit var counterTxt: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        increaseBtn = findViewById<Button>(R.id.increaseBtn)
        decreaseBtn = findViewById<Button>(R.id.decreaseBtn)
        counterTxt = findViewById<TextView>(R.id.counterTxt)

        increaseBtn.setOnClickListener {
            val currentTextString = counterTxt.text.toString()
            val currentTextStringInt = currentTextString.toInt()
            counterTxt.text = (currentTextStringInt + 1 ).toString()
        }
        decreaseBtn.setOnClickListener {
            val currentTextString = counterTxt.text.toString()
            val currentTextStringInt = currentTextString.toInt()
            counterTxt.text = (currentTextStringInt - 1 ).toString()
        }

    }
}