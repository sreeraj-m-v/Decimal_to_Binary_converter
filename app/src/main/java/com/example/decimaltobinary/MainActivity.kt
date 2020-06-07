package com.example.decimaltobinary

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.decimaltobinary.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.convertButton.setOnClickListener {
            dToBConverter()
        }
    }

    private fun dToBConverter() {
        var num: Int = binding.decimalNumber.text.toString().toInt()
        var bNumber: String = ""
        while (num > 0) {
            bNumber += (num % 2)
            num /= 2
        }
        binding.binaryNumber.text = "${bNumber.reversed()}"
    }
}