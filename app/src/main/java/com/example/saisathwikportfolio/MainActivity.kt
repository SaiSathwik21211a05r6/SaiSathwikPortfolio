package com.example.saisathwikportfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.saisathwikportfolio.homelist.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // val myhomelist = Datasource().loadAffirmations()
       // Handler().postDelayed({
            startActivity(Intent(this, Homescreen::class.java))
      //  }, 5000)

    }
}