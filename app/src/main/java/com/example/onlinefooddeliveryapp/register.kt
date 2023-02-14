package com.example.onlinefooddeliveryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.onlinefooddeliveryapp.databinding.ActivityRegisterBinding
import com.google.firebase.auth.FirebaseAuth

class register : AppCompatActivity() {


    lateinit var registerButton: Button
    private lateinit var binding:ActivityRegisterBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()
        registerButton = findViewById(R.id.registerbutton)

        binding.registerbutton.setOnClickListener{
            val email = binding.email.text.toString()
            val pass = binding.pass.text.toString()
            val confirmPass = binding.confirmpass.text.toString()

            if (email.isNotEmpty() && pass.isNotEmpty() && confirmPass.isNotEmpty()) {
                if (pass == confirmPass){

                    firebaseAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener{
                        if (it.isSuccessful){

                            val intent = Intent(this@register,loginpage::class.java)
                            startActivity(intent)

                        }else{
                            Toast.makeText(this,it.exception.toString(),Toast.LENGTH_SHORT).show()

                        }
                    }

            }else{
                Toast.makeText(this,"Password is not Matching",Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(this,"Empty Fields are not Allowed",Toast.LENGTH_SHORT).show()
            }
        }

    }

}