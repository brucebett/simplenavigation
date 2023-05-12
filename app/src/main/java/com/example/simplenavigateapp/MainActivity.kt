package com.example.simplenavigateapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var create : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        create = findViewById(R.id.btncreate)
        create.setOnClickListener {
            var intent = Intent(this, RegistrationActivity::class.java)
            startActivity(intent)
        }

    }
}