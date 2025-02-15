package com.example.legalease

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_in)

        val textView = findViewById<TextView>(R.id.sign_up)
        textView.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }

        val signInButton = findViewById<RelativeLayout>(R.id.sign_in_button)
        val usermail = findViewById<EditText>(R.id.your_email)
        val userpass = findViewById<EditText>(R.id.your_pass)

        signInButton.setOnClickListener {
            val email = usermail.text.toString().trim()
            val pass = userpass.text.toString().trim()

            if (email.isEmpty() || pass.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            } else if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                Toast.makeText(this, "Please enter a valid email address", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, HomeScreen::class.java)
                startActivity(intent)
                finish()
            }
        }

    }
}