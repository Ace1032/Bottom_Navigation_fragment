package com.example.crimilanlintent_second_try

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.*
import android.widget.Toast.makeText
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    //lateinit var bottomNavigationView: BottomNavigationView

    lateinit var crimeDeatailFragment: CrimeDeatailFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        crimeDeatailFragment = CrimeDeatailFragment()

        supportFragmentManager.beginTransaction().replace(
            R.id.container,
            crimeDeatailFragment
        ).commit()

        val bottomNavigationView: BottomNavigationView =
            findViewById(R.id.bottom_navigation)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    supportFragmentManager.beginTransaction().replace(
                        R.id.container,
                        crimeDeatailFragment
                    ).commit()
                    true
                }

                R.id.notification -> {
                    supportFragmentManager.beginTransaction().replace(
                        R.id.container,
                        crimeDeatailFragment
                    ).commit()
                    true
                }

                else -> false
            }

        }
    }
}