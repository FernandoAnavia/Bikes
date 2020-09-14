package com.example.bikes

//20344 Jose Fernando Gonzalez Anavia

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Switch
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.GsonBuilder
import kotlinx.android.synthetic.main.activity_user_preferences.*
import okhttp3.*
import java.io.IOException

class userPreferences : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_preferences)



        val actionbar = supportActionBar

        actionbar!!.title = "           PREFERENCES"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        //bike_list.layoutManager = LinearLayoutManager (this)
        //fetchJson()

        bike_list.layoutManager = LinearLayoutManager(this)
        //bike_list.adapter = MainAdapter()
        fetchJson()



    }



    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }



    fun fetchJson() {
        println("Attemp")
        val url = "https://my-json-server.typicode.com/FernandoAnavia/bike_listJson/bikeStationsDetails"
        val request = Request.Builder().url(url).build()


        val client = OkHttpClient()
        client.newCall(request).enqueue(object : Callback {
            override fun onResponse(call: Call, response: Response) {
                val body = response.body?.string()
                println(body)

                val gson = GsonBuilder().create()
                //val homeFeed = gson.fromJson(body, HomeFeed::class.java)
                val listOfBikes  = gson.fromJson(body, Array<bikeStationClass>::class.java).toList()

                runOnUiThread {
                    bike_list.adapter = MainAdapter(bikeStationClass())
                }
            }

            override fun onFailure(call: Call, e: IOException) {
                println("Fail")
            }


        })

    }


    }

