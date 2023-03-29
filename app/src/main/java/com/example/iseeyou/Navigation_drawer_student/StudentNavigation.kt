package com.example.iseeyou.Navigation_drawer_student

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.iseeyou.R
import com.example.iseeyou.databinding.ActivityStudentNavigation2Binding
import com.google.android.material.navigation.NavigationView

class StudentNavigation : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityStudentNavigation2Binding

    //My code


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        binding = ActivityStudentNavigation2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        //My code start here

        //My code end here
        setSupportActionBar(binding.appBarStudentNavigation2.toolbar)

//        binding.appBarStudentNavigation2.fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show()
//        }
        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_content_student_navigation2)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.studentLogs, R.id.violations, R.id.assessment, R.id.studentAnnoucement, R.id.schoolevents
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.student_navigation, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_student_navigation2)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

}

