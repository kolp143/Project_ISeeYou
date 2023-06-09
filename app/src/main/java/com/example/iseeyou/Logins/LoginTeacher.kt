package com.example.iseeyou.Logins

import android.content.Intent
import android.graphics.Paint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.iseeyou.Navigation_drawer_teacher.NavigationforTeacher
import com.example.iseeyou.R

class LoginTeacher : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)//submit //ayaw sa
        setContentView(R.layout.login_teacher)

        val textView = findViewById<TextView>(R.id.student)
        textView.paintFlags = textView.paintFlags or Paint.UNDERLINE_TEXT_FLAG

        val myTextView2 = findViewById<TextView>(R.id.student)
        myTextView2.setOnClickListener {
            val intent1 = Intent(this, LoginDefault_Student::class.java)
            startActivity(intent1)
        }
        val textView1 = findViewById<TextView>(R.id.parent2)
        textView1.paintFlags = textView1.paintFlags or Paint.UNDERLINE_TEXT_FLAG

            val myTextView3 = findViewById<TextView>(R.id.parent2)
            myTextView3.setOnClickListener {
                val intent2 = Intent(this, LoginParent::class.java)
                startActivity(intent2)
            }
        //for teacher login botton link to its navigation drawer
        var button1 = findViewById<Button>(R.id.button6)
        button1.setOnClickListener{
            val intent3 = Intent(this, NavigationforTeacher::class.java)
            startActivity(intent3)
        }
        var button2 = findViewById<Button>(R.id.button6)
        button2.setOnClickListener{
            val intent3 = Intent(this, NavigationforTeacher::class.java)
            startActivity(intent3)
        }
    }
}