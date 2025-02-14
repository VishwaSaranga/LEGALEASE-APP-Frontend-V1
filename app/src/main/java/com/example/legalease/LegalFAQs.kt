package com.example.legalease

import android.content.Intent
import android.os.Bundle
import android.widget.RelativeLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LegalFAQs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_legal_faqs)

        //Header Operations



        //Body Operations



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