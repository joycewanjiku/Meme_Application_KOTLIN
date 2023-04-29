package com.example.myapplicationmemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Meme5 : AppCompatActivity() {
    lateinit var  imageView15: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme5)
        imageView15=findViewById(R.id.imageView15)
        imageView15.setOnClickListener {
            val forward = Intent(this, Mem4::class.java)
            startActivity(forward)
        }
    }
}