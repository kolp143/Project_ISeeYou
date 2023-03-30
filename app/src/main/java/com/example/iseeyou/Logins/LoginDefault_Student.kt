package com.example.iseeyou.Logins

import android.content.Intent
import android.graphics.Paint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.iseeyou.Navigation_drawer_student.StudentNavigation
import com.example.iseeyou.R

class LoginDefault_Student : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.logindefault_student)

        val textView = findViewById<TextView>(R.id.parentlink)
        textView.paintFlags = textView.paintFlags or Paint.UNDERLINE_TEXT_FLAG

        val myTextView = findViewById<TextView>(R.id.parentlink)
        myTextView.setOnClickListener {
            val intent = Intent(this, LoginParent::class.java)
            startActivity(intent)
        }
        val textView2 = findViewById<TextView>(R.id.teacherlink)
        textView2.paintFlags = textView2.paintFlags or Paint.UNDERLINE_TEXT_FLAG

            val myTextView2 = findViewById<TextView>(R.id.teacherlink)
            myTextView2.setOnClickListener {
                val intent1 = Intent(this, LoginTeacher::class.java)
                startActivity(intent1)
            }

        //for student login botton link to its navigation drawer
        var button1 = findViewById<Button>(R.id.button5)
        button1.setOnClickListener{
            val intent1 = Intent(this, StudentNavigation::class.java)
            startActivity(intent1)
        }
    }
}