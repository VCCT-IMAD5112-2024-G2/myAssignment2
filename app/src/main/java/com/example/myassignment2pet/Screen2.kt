package com.example.myassignment2pet

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import java.util.Timer
import java.util.TimerTask

class Screen2 : AppCompatActivity() {

    private lateinit var hungerBar: ProgressBar
    private lateinit var cleanBar: ProgressBar
    private lateinit var happyBar: ProgressBar
    private lateinit var petImageView: ImageView


    private var hungerProgress = 0
    private var cleanProgress = 0
    private var happyProgress = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)



        val feed = findViewById<Button>(R.id.btnFeed)
        val clean = findViewById<Button>(R.id.btnClean)
        val play = findViewById<Button>(R.id.btnPlay)
        val image = findViewById<ImageView>(R.id.imageView2)


        // Initialize views
        initializeViews()
        updatePetStatus()

        feed.setOnClickListener {
            image.setImageResource(R.drawable.imageeating)
            feedPet()
        }
        clean.setOnClickListener {
            image.setImageResource(R.drawable.imagebath)
            cleanPet()
        }
        play.setOnClickListener {
            image.setImageResource(R.drawable.imageplay)
            playWithPet()
        }
        // Start timer to decrease progress bars every minute
        startTimer()


    }
    private fun initializeViews() {
        hungerBar = findViewById(R.id.hungerBar)
        cleanBar = findViewById(R.id.cleanBar)
        happyBar = findViewById(R.id.happyBar)
        petImageView = findViewById(R.id.imageView2)
    }
    private fun updatePetStatus() {
        hungerBar.progress = hungerProgress
        cleanBar.progress = cleanProgress
        happyBar.progress = happyProgress

    }

    private fun feedPet() {
        hungerProgress += 20
        if (hungerProgress > 100) {
            hungerProgress = 100
        }
        updatePetStatus()
    }

    private fun cleanPet() {
        cleanProgress += 20
        if (cleanProgress > 100) {
            cleanProgress = 100
        }
        updatePetStatus()
    }

    private fun playWithPet() {
        happyProgress += 20
        if (happyProgress > 100) {
            happyProgress = 100
        }
        updatePetStatus()
    }

    private fun startTimer() {
        val timer = Timer()
        timer.scheduleAtFixedRate(object : TimerTask() {
            override fun run() {
                decreaseProgressBars()
            }
        }, 0, 60000) // Decrease progress bars every minute
    }

    private fun decreaseProgressBars() {
        if (hungerProgress > 0) {
            hungerProgress -= 1 // Decrease hunger by 1 every minute
        }
        if (cleanProgress > 0) {
            cleanProgress -= 2 // Decrease cleanliness by 2 every minute
        }
        if (happyProgress > 0) {
            happyProgress -= 3 // Decrease happiness by 3 every minute
        }
        runOnUiThread {
            updatePetStatus()
        }
    }



}