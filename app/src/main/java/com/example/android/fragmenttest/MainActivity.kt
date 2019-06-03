package com.example.android.fragmenttest

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity(), BlankFragment.OnFragmentInteractionListener{

    override fun onFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private lateinit var editTextName: EditText
    private lateinit var editTextCity: EditText
    private lateinit var buttonSend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editTextName = findViewById(R.id.editTextName)
        editTextCity = findViewById(R.id.editTextCity)
        buttonSend = findViewById(R.id.button)
        buttonSend.setOnClickListener {
            val blankFragment = BlankFragment.newInstance(editTextName.text.toString(), editTextCity.text.toString())
            supportFragmentManager.beginTransaction().replace(R.id.fragment, blankFragment).addToBackStack("f").commit()
        }
    }
}
