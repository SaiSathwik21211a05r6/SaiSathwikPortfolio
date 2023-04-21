package com.example.saisathwikportfolio

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.saisathwikportfolio.databinding.*

private  lateinit var binding: EducationpageBinding
private  lateinit var binding2: HigeredudialogBinding
private  lateinit var collegebinding: CollegedialogBinding
private  lateinit var highedubinding: HighereducationbindingBinding
class Educationscreen: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= EducationpageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.schoolcertificatebutton.setOnClickListener{
            val builder = AlertDialog.Builder(this)

            builder.setPositiveButton("OK", null)
            builder.setTitle("Dialog Title")
            builder.setMessage("Dialog message goes here")
            binding2 = HigeredudialogBinding.inflate(LayoutInflater.from(this))
            builder.setView(binding2.root)

            val dialog: AlertDialog = builder.create()
            dialog.show()
            binding2.cancelbutton4.setOnClickListener   {
                dialog.dismiss()
            }



        }
        binding.collegecertificatebutton.setOnClickListener{
            val builder = AlertDialog.Builder(this)

            builder.setPositiveButton("OK", null)
            builder.setTitle("Dialog Title")
            builder.setMessage("Dialog message goes here")
            collegebinding = CollegedialogBinding.inflate(LayoutInflater.from(this))
            builder.setView(collegebinding.root)

            val dialog: AlertDialog = builder.create()
            dialog.show()
            collegebinding.cancelbutton4.setOnClickListener   {
                dialog.dismiss()
            }



        }
        binding.highedubutton.setOnClickListener{
            val builder = AlertDialog.Builder(this)

            builder.setPositiveButton("OK", null)

            highedubinding = HighereducationbindingBinding.inflate(LayoutInflater.from(this))
            builder.setView(highedubinding.root)

            val dialog: AlertDialog = builder.create()
            dialog.show()
            highedubinding.cancelbutton4.setOnClickListener {
                dialog.dismiss()
            }



        }

    }
}