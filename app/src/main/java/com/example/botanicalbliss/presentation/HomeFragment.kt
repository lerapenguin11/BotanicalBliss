package com.example.botanicalbliss.presentation

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.botanicalbliss.R
import com.example.botanicalbliss.databinding.FragmentHomeBinding
import com.example.botanicalbliss.presentation.adapter.PhotoAdapter
import com.example.botanicalbliss.presentation.adapter.TopArticleAdapter
import com.example.botanicalbliss.utilits.replaceFragmentMain
import com.example.botanicalbliss.viewmodel.FlowersViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : Fragment() {
    private var _binding : FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private val viewModel by viewModel<FlowersViewModel>()
    private val adapterTop = TopArticleAdapter()
    private val adapterPhoto = PhotoAdapter()

    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.cvHome.outlineAmbientShadowColor = ContextCompat.getColor(requireContext(), R.color.color3)
        binding.cvHome.outlineSpotShadowColor = ContextCompat.getColor(requireContext(), R.color.color3)

        binding.cvFlowers.setOnClickListener{ replaceFragmentMain(FlowersFragment()) }
        binding.cvArticles.setOnClickListener { replaceFragmentMain(ArticlesFragment()) }

        observeDataTop()
        observeDataPhoto()

        return binding.root
    }

    private fun observeDataPhoto() {
        binding.rvPhoto.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.rvPhoto.adapter = adapterPhoto
        adapterPhoto.setItem(viewModel.getPhoto())
    }

    private fun observeDataTop() {
        binding.rvTopArt.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.rvTopArt.adapter = adapterTop
        adapterTop.setItem(viewModel.getTopArticle())
    }
}