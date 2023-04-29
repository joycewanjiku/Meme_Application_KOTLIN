package com.example.myapplicationmemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Meme2TWO : AppCompatActivity() {
    lateinit var  imageView5: ImageView
    lateinit var  imageView4: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme2_two)
        imageView5=findViewById(R.id.imageView5)
        imageView4=findViewById(R.id.imageView4)
        imageView5.setOnClickListener {
            val forward= Intent(this,Mem3::class.java )
            startActivity(forward)
        }
        imageView4.setOnClickListener {
            val forward= Intent(this,MainActivity::class.java )
            startActivity(forward)
        }
    }
}