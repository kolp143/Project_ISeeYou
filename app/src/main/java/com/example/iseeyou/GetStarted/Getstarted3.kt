package com.example.iseeyou.GetStarted

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.iseeyou.R

class Getstarted3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.getstarted3)

        var button1 = findViewById<Button>(R.id.button2)
        button1.setOnClickListener{
            val intent1 = Intent(this, Getstarted4::class.java)
            startActivity(intent1)
        }
    }
}