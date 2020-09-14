package com.example.bikes

//20344 Jose Fernando Gonzalez Anavia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_maps.*

class LandingPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing_page)


        val aboutBtn = findViewById<Button>(R.id.about_us_button)
        aboutBtn.setOnClickListener {
            startActivity(Intent(this@LandingPage,aboutUsPage::class.java))
        }
        val mapBtn = findViewById<Button>(R.id.map_button)
        mapBtn.setOnClickListener {
            startActivity(Intent(this@LandingPage,MapsActivity::class.java))
        }
        val userPrefBtn = findViewById<Button>(R.id.preferences_button)
        userPrefBtn.setOnClickListener {
            startActivity(Intent(this@LandingPage,userPreferences::class.java))
        }
        val contactBtn = findViewById<Button>(R.id.contact_button)
        contactBtn.setOnClickListener {
            startActivity(Intent(this@LandingPage,contactPage::class.java))
        }



    }



}
