package com.example.customdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val dataget = findViewById<TextView>(R.id.spinget)

        var datagets = intent.getStringExtra("data")
        dataget.text = datagets


    }
}