package com.example.iseeyou.GetStarted

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.iseeyou.Logins.LoginDefault_Student
import com.example.iseeyou.R

class Getstarted4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.getstarted4)

        var button1 = findViewById<Button>(R.id.button4)
        button1.setOnClickListener{
            val intent1 = Intent(this, LoginDefault_Student::class.java)
            startActivity(intent1)
        }
    }
}