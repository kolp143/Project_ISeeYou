package com.example.iseeyou.Logins

import android.content.Intent
import android.graphics.Paint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.iseeyou.Navigation_drawer_parent.ParentNavigation
import com.example.iseeyou.ParentRegistration.ParentRegistration
import com.example.iseeyou.R

class LoginParent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_parent)

        val textView = findViewById<TextView>(R.id.studentlink)
        textView.paintFlags = textView.paintFlags or Paint.UNDERLINE_TEXT_FLAG

        val myTextView2 = findViewById<TextView>(R.id.studentlink)
        myTextView2.setOnClickListener {
            val intent1 = Intent(this, LoginDefault_Student::class.java)
            startActivity(intent1)
        }
        val textView2 = findViewById<TextView>(R.id.teacherlink3)
        textView2.paintFlags = textView2.paintFlags or Paint.UNDERLINE_TEXT_FLAG

            val myTextView3 = findViewById<TextView>(R.id.teacherlink3)
            myTextView3.setOnClickListener {
                val intent2 = Intent(this, LoginTeacher::class.java)
                startActivity(intent2)
            }
        val myTextView4 = findViewById<TextView>(R.id.registration)
        myTextView4.setOnClickListener {
            val intent1 = Intent(this, ParentRegistration::class.java)
            startActivity(intent1)
        }
        //for parent login botton link to its navigation drawer
        var button1 = findViewById<Button>(R.id.button9)
        button1.setOnClickListener{
            val intent3 = Intent(this, ParentNavigation::class.java)
            startActivity(intent3)
        }
    }
}