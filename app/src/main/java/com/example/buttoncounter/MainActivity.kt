package com.example.buttoncounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var addbtn : Button
    lateinit var subbtn :Button
    lateinit var textView :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addbtn = findViewById(R.id.add)
        subbtn = findViewById(R.id.minus)
        textView = findViewById(R.id.textView)

        addbtn.setOnClickListener {
         var num = textView.text.toString().toInt()
            num++
         textView.text= "$num"
        }
        subbtn.setOnClickListener {
            var num = textView.text.toString().toInt()
            num--
            textView.text= "$num"
        }
    }
}