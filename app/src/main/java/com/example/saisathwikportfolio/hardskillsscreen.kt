package com.example.saisathwikportfolio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.saisathwikportfolio.databinding.AchievementsBinding
import com.example.saisathwikportfolio.databinding.SkillspageBinding

class Hardskillsscreen: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.skillspage)
        val binding= SkillspageBinding.inflate(layoutInflater)
        //View view=binding.getRoot()
        setContentView(binding.root)
        binding.machinelearning.setOnClickListener{
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("http://www.google.com")
            )
            startActivity(browserIntent)

        }
    }
}