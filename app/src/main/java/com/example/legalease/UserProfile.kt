package com.example.legalease

import android.content.Intent
import android.os.Bundle
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class UserProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user_profile)

        //Header Operations

        val back_icon = findViewById<RelativeLayout>(R.id.back_icon)
        back_icon.setOnClickListener{
            val intent = Intent(this, HomeScreen::class.java)
            startActivity(intent)
        }

        //Body Operations

        val changepass = findViewById<RelativeLayout>(R.id.navbtn_change_password)
        changepass.setOnClickListener{
            val intent = Intent(this, UserChangePassword::class.java)
            startActivity(intent)
        }

        val deteleprofilebtn = findViewById<RelativeLayout>(R.id.profile_deletebtn)
        deteleprofilebtn.setOnClickListener{
            val intent = Intent(this, SignUp::class.java)
            Toast.makeText(this, "Deleted Your Profile!", Toast.LENGTH_SHORT).show()
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