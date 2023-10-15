package com.example.botanicalbliss.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.botanicalbliss.R
import com.example.botanicalbliss.databinding.FragmentArticlesBinding
import com.example.botanicalbliss.databinding.FragmentHomeBinding
import com.example.botanicalbliss.presentation.adapter.ArticlesAdapter
import com.example.botanicalbliss.utilits.replaceFragmentMain
import com.example.botanicalbliss.viewmodel.FlowersViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class ArticlesFragment : Fragment() {
    private var _binding : FragmentArticlesBinding? = null
    private val binding get() = _binding!!
    private val viewModel by viewModel<FlowersViewModel>()
    private val adapter = ArticlesAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentArticlesBinding.inflate(inflater, container, false)

        binding.btArrow.setOnClickListener { replaceFragmentMain(HomeFragment()) }

        observeDataArticles()

        return binding.root
    }

    private fun observeDataArticles() {
        binding.rvArticles.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.rvArticles.adapter = adapter
        adapter.setItem(viewModel.getArticle())
    }
}