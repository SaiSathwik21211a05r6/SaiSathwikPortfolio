package com.example.saisathwikportfolio

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.saisathwikportfolio.databinding.AbouthomeBinding
import com.example.saisathwikportfolio.databinding.SkillspagemainBinding

class Aboutscreen: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.abouthome)
        val binding= AbouthomeBinding.inflate(layoutInflater)
        //View view=binding.getRoot()
        setContentView(binding.root)
        binding.description.setOnClickListener{
            val intent = Intent(this, Description::class.java)
            startActivity(intent)
        }
        binding.demographics.setOnClickListener{
            val intent = Intent(this, Demographics::class.java)
            startActivity(intent)
        }
    }
}