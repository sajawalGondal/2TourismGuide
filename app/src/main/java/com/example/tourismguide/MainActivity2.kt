package com.example.tourismguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val dubaibutton = findViewById<Button>(R.id.button_dubai)
        dubaibutton.setOnClickListener {
            val Intent = Intent(this,Dubai_Places::class.java)
            startActivity(Intent)
        }
        val abudhabhibutton = findViewById<Button>(R.id.button_abudhabi)
        abudhabhibutton.setOnClickListener {
            val Intent = Intent(this,Abudhabi_Places::class.java)
            startActivity(Intent)
        }
        val sharjahbutton = findViewById<Button>(R.id.button_shj)
        sharjahbutton.setOnClickListener {
            val Intent = Intent(this,SharjahPlaces::class.java)
            startActivity(Intent)
        }
        val uaqbutton = findViewById<Button>(R.id.btn_uaq)
        uaqbutton.setOnClickListener {
            val Intent = Intent(this,Ummal_quwain::class.java)
            startActivity(Intent)
        }
        val ajmanbutton =findViewById<Button>(R.id.btn_ajman)
        ajmanbutton.setOnClickListener {
            val Intent = Intent(this,Ajman_places::class.java)
            startActivity(Intent)
        }
        val rakbutton = findViewById<Button>(R.id.btn_rak)
        rakbutton.setOnClickListener {
            val Intent = Intent(this,Rak_Places::class.java)
            startActivity(Intent)
        }
        val fujairahbutton = findViewById<Button>(R.id.button_fujairah)
        fujairahbutton.setOnClickListener {
            val Intent = Intent(this,fujairah_places::class.java)
            startActivity(Intent)
        }
        val infobutton = findViewById<Button>(R.id.btn_instruction)
        infobutton.setOnClickListener {
            val Intent = Intent(this,instructions::class.java)
            startActivity(Intent)
        }
    }
}