package com.example.fragmentspractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var instanceOfFragmentOneButton: Button
    private lateinit var instanceOfFragmentTwoButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        instanceOfFragmentOneButton = findViewById(R.id.button)
        instanceOfFragmentTwoButton = findViewById(R.id.button2)

        val instanceOfFragmentOne = FragmentOne()
        val instanceOfFragmentTwo = FragmentTwo()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayoutId, instanceOfFragmentOne)
            commit()
        }

        instanceOfFragmentOneButton.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frameLayoutId, instanceOfFragmentOne)
                addToBackStack(null)
                commit()
            }
        }

        instanceOfFragmentTwoButton.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frameLayoutId, instanceOfFragmentTwo)
                addToBackStack(null)
                commit()
            }
        }
    }
}