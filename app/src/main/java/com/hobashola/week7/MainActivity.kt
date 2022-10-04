package com.hobashola.week7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //get reference to all view

        var et_edit_text_phone = findViewById<EditText>(R.id.editTextPhone)
        var button = findViewById<MaterialButton>(R.id.button)

        // set on-click listener

        button.setOnClickListener {
            val edit_text = et_edit_text_phone.text
            Toast.makeText(this@MainActivity, edit_text, Toast.LENGTH_LONG ).show()

        }






    }


}