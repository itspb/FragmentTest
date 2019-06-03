package com.example.android.fragmenttest

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

private const val ARG_NAME = "name"
private const val ARG_CITY = "city"

class BlankFragment : Fragment() {
    private var name: String? = null
    private var city: String? = null
    private lateinit var textViewNameAndCity: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            name = it.getString(ARG_NAME)
            city = it.getString(ARG_CITY)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
            return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textViewNameAndCity = view.findViewById(R.id.textViewNameAndCity)
        val result = "Hello $name from $city"
        textViewNameAndCity.text = result
    }

    companion object {
        @JvmStatic
        fun newInstance(name: String, city: String) =
            BlankFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_NAME, name)
                    putString(ARG_CITY, city)
                }
            }
    }
}
