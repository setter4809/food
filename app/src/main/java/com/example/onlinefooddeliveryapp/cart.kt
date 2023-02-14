package com.example.onlinefooddeliveryapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class cart : AppCompatActivity() {

lateinit var pbutton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        pbutton = findViewById(R.id.pbutton)

        pbutton.setOnClickListener {
            val intent = Intent(this@cart,payout::class.java)
            startActivity(intent)
        }
    }
}

