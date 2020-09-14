package com.example.bikes

//20344 Jose Fernando Gonzalez Anavia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class aboutUsPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_us_page)

        val actionbar = supportActionBar

        actionbar!!.title = "         ABOUT US"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}


