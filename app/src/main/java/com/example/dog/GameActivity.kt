package com.example.dog

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GameActivity : AppCompatActivity() {

    private lateinit var petImage: ImageView
    private lateinit var healthTextView: TextView
    private lateinit var hungerTextView: TextView
    private lateinit var cleanlinessTextView: TextView
    private lateinit var messageTextView: TextView

    private var petHealth = 0
    private var petHunger = 0
    private var petCleanliness = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        petImage = findViewById(R.id.pet_imdwdage)

        healthTextView = findViewById(R.id.happyTextView)
        hungerTextView = findViewById(R.id.hungerTextView)
        cleanlinessTextView = findViewById(R.id.cleanlinessTextView)
        messageTextView = findViewById(R.id.messageTextView)

        val feedButton = findViewById<Button>(R.id.feedButton)
        val cleanButton = findViewById<Button>(R.id.cleanButton)
        val playButton = findViewById<Button>(R.id.playButton)
        val imageView2 : ImageView = findViewById<ImageView>(R.id.pet_imdwdage)



       }
 }

