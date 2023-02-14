package com.example.onlinefooddeliveryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var handler: Handler



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        handler = Handler()
        handler.postDelayed({
            val intent = Intent(this,loginpage::class.java)
            startActivity(intent)
            finish()
        },3000)







    }

}