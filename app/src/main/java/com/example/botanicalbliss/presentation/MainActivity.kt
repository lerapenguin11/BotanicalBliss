package com.example.botanicalbliss.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.botanicalbliss.R
import com.example.botanicalbliss.databinding.ActivityMainBinding
import com.example.botanicalbliss.utilits.APP_ACTIVITY

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        APP_ACTIVITY = this
        setContentView(binding.root)
    }
}