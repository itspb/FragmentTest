package com.example.android.fragmenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), BlankFragment.MyListener {

    private lateinit var button : Button

    override fun onButtonClick(s: String) {
        button.visibility = View.VISIBLE
        button.text = "I'm here"

        val f1 = supportFragmentManager.findFragmentById(R.id.fragment)
        f1!!.view!!.findViewById<TextView>(R.id.textViewNameAndCity).text = s

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.buttonInvisible)
        supportFragmentManager.beginTransaction().replace(R.id.fragment, BlankFragment0()).commit()

    }
}
