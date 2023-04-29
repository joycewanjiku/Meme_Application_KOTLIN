package com.example.myapplicationmemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Mem3 : AppCompatActivity() {
    lateinit var  imageView9: ImageView
    lateinit var  imageView8: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mem3)
        imageView9=findViewById(R.id.imageView8)
        imageView8=findViewById(R.id.imageView8)
        imageView9.setOnClickListener {
            val forward = Intent(this,Mem4::class.java)
            startActivity(forward)
        }
        imageView8.setOnClickListener {
            val forward = Intent(this,Mem4::class.java)
            startActivity(forward)
        }
    }
}