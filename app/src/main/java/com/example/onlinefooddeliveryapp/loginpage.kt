package com.example.onlinefooddeliveryapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth


class loginpage : AppCompatActivity() {

    lateinit var Email: EditText
    lateinit var Pass: EditText
    lateinit var loginButton: Button
    lateinit var forgot: TextView
    lateinit var donthaveaccount: TextView
    val validemail = "harshit514@gmail.com"
    val validpass = "12345678"
    private var mAuth: FirebaseAuth? = null


    override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = mAuth!!.currentUser
        updateUI(currentUser)
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginpage)

        mAuth!!.signInWithCustomToken(mCustomToken)
            .addOnCompleteListener(
                this
            ) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.d(TAG, "signInWithCustomToken:success")
                    val user = mAuth!!.currentUser
                    updateUI(user)
                } else {
                    // If sign in fails, display a message to the user.
                    Log.w(TAG, "signInWithCustomToken:failure", task.exception)
                    Toast.makeText(
                        this@CustomAuthActivity, "Authentication failed.",
                        Toast.LENGTH_SHORT
                    ).show()
                    updateUI(null)
                }
            }


        Email = findViewById(R.id.Email)
        Pass = findViewById(R.id.Pass)
        loginButton = findViewById(R.id.button)
        forgot = findViewById(R.id.forgotpage)
        donthaveaccount = findViewById(R.id.donthaveaccount)


        loginButton.setOnClickListener {

            val email = Email.text.toString()
            val pass =  Pass.text.toString()

            if ((email == validemail) && (pass == validpass)){

                val intent = Intent(this@loginpage,Dahboard::class.java)
                startActivity(intent)
            }

               else
                {
                    Toast.makeText(this@loginpage,"email and password is not valid",Toast.LENGTH_SHORT).show()
                }

        }

            forgot.setOnClickListener {
                val intent = Intent(this@loginpage,forgotpage::class.java)
                startActivity(intent)
            }

            donthaveaccount.setOnClickListener {
                val intent = Intent(this@loginpage,register::class.java)
                startActivity(intent)
            }



        }

    }









