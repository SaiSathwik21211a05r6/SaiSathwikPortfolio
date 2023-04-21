package com.example.saisathwikportfolio

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.saisathwikportfolio.homelist.Datasource

class Homescreen: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homepage)
        val myDataset = Datasource().loadAffirmations()
        val mainlist = findViewById<RecyclerView>(R.id.homerecycler)
        mainlist.adapter = Mainrecyclerviewadaptor(this, myDataset)


    }
}