package com.example.iseeyou.GetStarted

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.iseeyou.R

class GetStarted1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.getstarted1)

        var button1 = findViewById<Button>(R.id.button)
        button1.setOnClickListener{
            val intent1 = Intent(this, GetStarted2::class.java)
            startActivity(intent1)
        }
    }
}