package com.example.iseeyou.ParentRegistration

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.iseeyou.Logins.LoginParent
import com.example.iseeyou.Navigation_drawer_parent.ParentNavigation
import com.example.iseeyou.R

class ParentRegistration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parent_registration)

        val backimage = findViewById<ImageView>(R.id.back2)
        backimage.setOnClickListener {
            val intent = Intent(this, LoginParent::class.java)
            startActivity(intent)
        }

        var button2 = findViewById<Button>(R.id.button7)
        button2.setOnClickListener{
            val intent3 = Intent(this, ParentNavigation::class.java)
            startActivity(intent3)

        }
    }
}