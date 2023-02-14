package com.example.onlinefooddeliveryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Coffees : AppCompatActivity() {

    lateinit var ArabicaButton : Button
    lateinit var cartButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coffees)


        ArabicaButton = findViewById(R.id.arabicabutton)
        cartButton = findViewById(R.id.cartbutton)


        ArabicaButton.setOnClickListener{

            Toast.makeText(this@Coffees,"Your order is now Added to Cart",Toast.LENGTH_SHORT).show()

        }

        cartButton.setOnClickListener{
            val intent = Intent(this@Coffees,cart::class.java)
            startActivity(intent)
        }








    }
}