package com.example.myapplicationmemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Mem4 : AppCompatActivity() {
    lateinit var  imageView11: ImageView
    lateinit var  imageView10: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mem4)
        imageView11=findViewById(R.id.imageView11)
        imageView10=findViewById(R.id.imageView10)
        imageView11.setOnClickListener {
            val forward = Intent(this, Meme5::class.java)
            startActivity(forward)
        }
        imageView10.setOnClickListener {
            val forward = Intent(this, Mem3::class.java)
            startActivity(forward)
        }
    }
}