package com.example.botanicalbliss.presentation.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.botanicalbliss.R
import com.example.botanicalbliss.databinding.FragmentOnBoardingFirstBinding
import com.example.botanicalbliss.databinding.FragmentOnBoardingSecondBinding
import com.example.botanicalbliss.presentation.HomeFragment
import com.example.botanicalbliss.utilits.replaceFragmentMain

class OnBoardingSecondFragment : Fragment() {
    private var _binding : FragmentOnBoardingSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentOnBoardingSecondBinding.inflate(inflater, container, false)

        binding.btNext.setOnClickListener { replaceFragmentMain(HomeFragment()) }

        return binding.root
    }
}