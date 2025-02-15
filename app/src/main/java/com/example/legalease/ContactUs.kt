package com.example.legalease

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ContactUs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_contact_us)

        //Header Operations

        val back_icon = findViewById<RelativeLayout>(R.id.back_icon)
        back_icon.setOnClickListener{
            val intent = Intent(this, AboutUs::class.java)
            startActivity(intent)
        }


        //Body Operations

        val nameEditText = findViewById<EditText>(R.id.username_box_txt)
        val emailEditText = findViewById<EditText>(R.id.usermail_box_txt)
        val contactEditText = findViewById<EditText>(R.id.userphone_box_txt)
        val messageEditText = findViewById<EditText>(R.id.usermsg_box_txt)
        val sendButton = findViewById<RelativeLayout>(R.id.msgusbtn)

        sendButton.setOnClickListener {
            val name = nameEditText.text.toString().trim()
            val email = emailEditText.text.toString().trim()
            val contact = contactEditText.text.toString().trim()
            val message = messageEditText.text.toString().trim()

            if (name.isEmpty() || email.isEmpty() || contact.isEmpty() || message.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            } else if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                Toast.makeText(this, "Please enter a valid email address", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Your message sent successfully!", Toast.LENGTH_SHORT).show()

                nameEditText.text.clear()
                emailEditText.text.clear()
                contactEditText.text.clear()
                messageEditText.text.clear()
            }
        }



        //Navbar Operations

        val h_frame = findViewById<RelativeLayout>(R.id.h_frame)
        h_frame.setOnClickListener {
            val intent = Intent(this, HomeScreen::class.java)
            startActivity(intent)
        }

        val l_frame = findViewById<RelativeLayout>(R.id.l_frame)
        l_frame.setOnClickListener {
            val intent = Intent(this, SriLankaLaws::class.java)
            startActivity(intent)
        }

        val f_frame = findViewById<RelativeLayout>(R.id.f_frame)
        f_frame.setOnClickListener {
            val intent = Intent(this, LegalFAQs::class.java)
            startActivity(intent)
        }

        val a_frame = findViewById<RelativeLayout>(R.id.a_frame)
        a_frame.setOnClickListener {
            val intent = Intent(this, LegalAids::class.java)
            startActivity(intent)
        }

        //..............................


    }
}