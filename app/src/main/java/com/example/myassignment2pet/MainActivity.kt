package com.example.myassignment2pet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart = findViewById<Button>(R.id.btnGetStarted)

        btnStart.setOnClickListener {
            val intent = Intent(this@MainActivity, Screen2::class.java)
            startActivity(intent)


        }

    }
}