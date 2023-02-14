package com.example.onlinefooddeliveryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Dahboard : AppCompatActivity() {

    lateinit var ImageView : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dahboard)

        ImageView = findViewById(R.id.tea)

        ImageView.setOnClickListener {
            val intent = Intent(this@Dahboard,Coffees::class.java)
            startActivity(intent)
        }

    }
}