package com.example.saisathwikportfolio

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.saisathwikportfolio.databinding.EducationpageBinding
import com.example.saisathwikportfolio.databinding.KnowmorepageBinding

private lateinit var binding: KnowmorepageBinding
class Knowmorescreen:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= KnowmorepageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.achievements.setOnClickListener{
            val intent = Intent(this, AchievementsScreen::class.java)
            startActivity(intent)
        }

        binding.certifications.setOnClickListener{
            val intent = Intent(this, Certificationsscreen::class.java)
            startActivity(intent)
        }
    }
}