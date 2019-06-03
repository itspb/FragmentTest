package com.example.android.fragmenttest


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.FragmentManager

class BlankFragment0 : Fragment() {

    private lateinit var editTextName: EditText
    private lateinit var editTextCity: EditText
    private lateinit var buttonSend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
            return inflater.inflate(R.layout.fragment_blank_fragment0, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        editTextName = view.findViewById(R.id.editTextName)
        editTextCity = view.findViewById(R.id.editTextCity)
        buttonSend = view.findViewById(R.id.button)
        buttonSend.setOnClickListener {
            val blankFragment = BlankFragment.newInstance(editTextName.text.toString(), editTextCity.text.toString())
            fragmentManager!!.beginTransaction().replace(R.id.fragment, blankFragment).addToBackStack("f1").commit()
        }
    }

}
