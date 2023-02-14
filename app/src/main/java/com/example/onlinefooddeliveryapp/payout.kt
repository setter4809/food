package com.example.onlinefooddeliveryapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class payout : AppCompatActivity() {

     lateinit var button1 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payout)

        button1 = findViewById(R.id.button1)

        button1.setOnClickListener {
            val intent = Intent(this@payout,Dahboard::class.java)
            startActivity(intent)
        }

    }
}