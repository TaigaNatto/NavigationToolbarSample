package com.example.navigationtoolbarsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController

class MainActivity : AppCompatActivity() {

    val toolbar by lazy { findViewById<Toolbar>(R.id.toolbar) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar.title = this.title
        setSupportActionBar(toolbar)

        val navController = findNavController(R.id.nav_host_fragment)
        setupActionBarWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean = findNavController(R.id.nav_host_fragment).navigateUp()
}
