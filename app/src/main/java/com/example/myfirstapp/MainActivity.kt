package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe=findViewById<Button>(R.id.mybutton)  // val -> value can't be changed  var-> value can be changed
        val tvTextView=findViewById<TextView>(R.id.textView)

        var timesclicked=0

        btnClickMe.setOnClickListener {
            timesclicked += 1

            tvTextView.text=timesclicked.toString()

            Toast.makeText(this,"Hii Tushar Mahajan",Toast.LENGTH_LONG).show()
        }

    }
}