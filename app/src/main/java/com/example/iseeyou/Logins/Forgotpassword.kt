package com.example.iseeyou.Logins

import android.content.Intent
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.iseeyou.R

class Forgotpassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.forgotpassword)

        val backimage = findViewById<ImageView>(R.id.back)
        backimage.setOnClickListener {
            val intent = Intent(this, LoginDefault_Student::class.java)
            startActivity(intent)
        }
        val myTextView = findViewById<TextView>(R.id.loginas)
        myTextView.setOnClickListener {
            val intent = Intent(this, LoginDefault_Student::class.java)
            startActivity(intent)
        }
    }
}