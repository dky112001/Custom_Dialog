package com.example.customdialog

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var photos = findViewById<ImageView>(R.id.photo)
        photos.setOnClickListener {

            Dialog()

        }


        val spinner = findViewById<Spinner>(R.id.spineer)
        val button = findViewById<Button>(R.id.button)
        var array = arrayOf("deepak kumar","ramu kumae","kamal","kisan","hasan","hindi")
        var adapter = ArrayAdapter(this, com.google.android.material.R.layout.support_simple_spinner_dropdown_item,array)
        spinner.adapter= adapter

        button.setOnClickListener {
        val selecteddata = spinner.selectedItem.toString()
        val intent = Intent(this,Second::class.java)
        intent.putExtra("data",selecteddata)
        startActivity(intent)
        }

    }

    @SuppressLint("SuspiciousIndentation")
    private fun Dialog() {

        var layout = LayoutInflater.from(this).inflate(R.layout.custom_dialog2,null,false)
        var cancelbutton = layout.findViewById<TextView>(R.id.cancel_btn)
        var backbutton = layout.findViewById<TextView>(R.id.back_btn)
        var okbutton = layout.findViewById<TextView>(R.id.ok_btn)

        var alertDialog = AlertDialog.Builder(this)

        var dialog = alertDialog.create()
        dialog.setCancelable(false)

        cancelbutton.setOnClickListener {
            Toast.makeText(this ,"Cancel", Toast.LENGTH_SHORT).show()
            onBackPressed()
        }

        backbutton.setOnClickListener {
            Toast.makeText(this, "Back", Toast.LENGTH_SHORT).show()
           dialog.dismiss()

        }

        okbutton.setOnClickListener {
            Toast.makeText(this, "Ok", Toast.LENGTH_SHORT).show()
            dialog.dismiss()
        }


            dialog.setView(layout)
            dialog.show()



        val spinner = findViewById<Spinner>(R.id.spineer)
        var array = arrayOf("deepak kumar","ramu kumae","kamal","kisan","hasan","hindi")
        var adapter = ArrayAdapter(this, com.google.android.material.R.layout.support_simple_spinner_dropdown_item,array)
        spinner.adapter= adapter

    }
}


