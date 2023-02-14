package com.example.onlinefooddeliveryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class forgotscreen : AppCompatActivity() {

    lateinit var NextButton : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgotscreen)

        NextButton = findViewById(R.id.Nextbutton)

        NextButton.setOnClickListener{
          val  intent = Intent(this@forgotscreen,loginpage::class.java)
          startActivity(intent)
        }

    }
}