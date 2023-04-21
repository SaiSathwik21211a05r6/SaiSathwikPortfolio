package com.example.saisathwikportfolio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.saisathwikportfolio.databinding.AchievementsBinding


class AchievementsScreen: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding= AchievementsBinding.inflate(layoutInflater)
        //View view=binding.getRoot()
        setContentView(binding.root)

    }
}