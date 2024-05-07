package com.example.dog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val welcomeTextView: TextView = findViewById<TextView>(R.id.welcomeTextView)
        val imageView: ImageView = findViewById<ImageView>(R.id.imageView)

        val startButton = findViewById<Button>(R.id.startButton)
        startButton.setOnClickListener {
            startActivity(Intent(this, GameActivity::class.java))

        }
    }
}