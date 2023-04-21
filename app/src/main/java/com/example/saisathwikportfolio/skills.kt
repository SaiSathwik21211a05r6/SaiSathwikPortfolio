package com.example.saisathwikportfolio

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.saisathwikportfolio.R.layout.skillspagemain
import com.example.saisathwikportfolio.databinding.ActivityMainBinding
import com.example.saisathwikportfolio.databinding.SkillspagemainBinding

class Skills: AppCompatActivity() {
    private  lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding= SkillspagemainBinding.inflate(layoutInflater)
        //View view=binding.getRoot()
        setContentView(binding.root)
        binding.hardskills.setOnClickListener{
            val intent = Intent(this, Hardskillsscreen::class.java)
            startActivity(intent)
        }
        binding.softskills.setOnClickListener{
            val intent = Intent(this, Softskillsscreen::class.java)
            startActivity(intent)
        }
}}