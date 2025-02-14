package com.example.legalease

import android.content.Intent
import android.os.Bundle
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_screen)

        //Header Operations

        val profile_icon = findViewById<RelativeLayout>(R.id.profile_icon)
        profile_icon.setOnClickListener{
            val intent = Intent(this, UserProfile::class.java)
            startActivity(intent)
        }

        //Body Operations

        val contactbtn = findViewById<RelativeLayout>(R.id.contactbtn)
        contactbtn.setOnClickListener {
            val intent = Intent(this, EmergencyContacts::class.java)
            startActivity(intent)
        }

        val lawslbtn = findViewById<RelativeLayout>(R.id.lawslbtn)
        lawslbtn.setOnClickListener {
            val intent = Intent(this, SriLankaLaws::class.java)
            startActivity(intent)
        }

        val aboutusbtn = findViewById<RelativeLayout>(R.id.aboutusbtn)
        aboutusbtn.setOnClickListener {
            val intent = Intent(this, AboutUs::class.java)
            startActivity(intent)
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