package com.example.spinnertest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner_field = findViewById<Spinner>(R.id.spinner_field)
        val str = resources.getStringArray(R.array.spinnerArray)

        val adapter = ArrayAdapter(this, R.layout.item_spinner, str)

        adapter.setDropDownViewResource(R.layout.item_spinner)

        spinner_field.adapter = adapter

        spinner_field.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(adapterView: AdapterView<*>, view: View, i: Int, l: Long) {}
            override fun onNothingSelected(adapterView: AdapterView<*>) {}
        }
    }
}
