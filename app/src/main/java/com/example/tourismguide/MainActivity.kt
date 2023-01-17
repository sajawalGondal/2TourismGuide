package com.example.tourismguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val welcomebutton = findViewById<Button>(R.id.welcome_btn)
        welcomebutton.setOnClickListener {
            val Intent = Intent(this,MainActivity2::class.java)
            startActivity(Intent)
        }
    }
}