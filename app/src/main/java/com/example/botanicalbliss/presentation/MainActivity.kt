package com.example.botanicalbliss.presentation

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.example.botanicalbliss.R
import com.example.botanicalbliss.databinding.ActivityMainBinding
import com.example.botanicalbliss.presentation.onboarding.OnBoardingFirstFragment
import com.example.botanicalbliss.utilits.APP_ACTIVITY
import com.example.botanicalbliss.utilits.replaceFragmentMain

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        APP_ACTIVITY = this
        setContentView(binding.root)

        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        replaceFragmentMain(OnBoardingFirstFragment())
    }
}