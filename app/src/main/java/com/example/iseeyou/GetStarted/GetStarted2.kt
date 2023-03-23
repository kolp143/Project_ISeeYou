package com.example.iseeyou.GetStarted

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.iseeyou.R

class GetStarted2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.getstarted2)

        var button1 = findViewById<Button>(R.id.button3)
        button1.setOnClickListener{
            val intent1 = Intent(this, Getstarted3::class.java)
            startActivity(intent1)
        }
    }
}