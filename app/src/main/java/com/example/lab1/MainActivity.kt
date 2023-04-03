package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView1)
        val button = findViewById<Button>(R.id.button)
        val userInput = findViewById<EditText>(R.id.userInput)

        textView.isVisible = false

        button.setOnClickListener{
            textView.text = userInput.text.toString()
            textView.isVisible = true
        }
    }
}