package com.example.iseeyou.Signout

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.iseeyou.Logins.LoginDefault_Student
import com.example.iseeyou.R

class signout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signout_design)
        //dd
        var button1 = findViewById<Button>(R.id.btn)
        button1.setOnClickListener{
            val intent3 = Intent(this, LoginDefault_Student::class.java)
            startActivity(intent3)
        }
    }
}