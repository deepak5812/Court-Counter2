package com.example.court_counter2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.court_counter2.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
lateinit var model:MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        model = ViewModelProvider(this).get(MainViewModel::class.java)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

         binding.apply {
             textView.text=model.numA.toString()
             textView2.text=model.numB.toString()

             button.setOnClickListener {
                 model.numA=model.numA+1
                 textView.text=model.numA.toString()
             }
             button2.setOnClickListener {
                 model.numA=model.numA+2
                 textView.text=model.numA.toString()
             }
             button3.setOnClickListener {
                 model.numA=model.numA+3
                 textView.text=model.numA.toString()
             }
             button4.setOnClickListener {
                 model.numB=model.numB+1
                 textView2.text=model.numB.toString()
             }
             button5.setOnClickListener {
                 model.numB=model.numB+3
                 textView2.text=model.numB.toString()
             }
             button6.setOnClickListener {
                 model.numB=model.numB+2
                 textView2.text=model.numB.toString()
             }
             button7.setOnClickListener {
                 model.numB=0
                 textView2.text=model.numB.toString()
                 model.numA=0
                 textView.text=model.numA.toString()

             }
         }

    }
}