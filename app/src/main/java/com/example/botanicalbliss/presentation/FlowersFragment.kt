package com.example.botanicalbliss.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.botanicalbliss.R
import com.example.botanicalbliss.databinding.FragmentFlowersBinding
import com.example.botanicalbliss.databinding.FragmentHomeBinding
import com.example.botanicalbliss.presentation.adapter.FlowersAdapter
import com.example.botanicalbliss.presentation.listener.FlowersListener
import com.example.botanicalbliss.utilits.replaceFragmentMain
import com.example.botanicalbliss.viewmodel.FlowersViewModel
import com.example.domain.entities.Flowers
import org.koin.androidx.viewmodel.ext.android.viewModel

class FlowersFragment : Fragment(), FlowersListener {
    private var _binding : FragmentFlowersBinding? = null
    private val binding get() = _binding!!
    private val viewModel by viewModel<FlowersViewModel>()
    private val adapter = FlowersAdapter(this)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFlowersBinding.inflate(inflater, container, false)

        binding.btArrow.setOnClickListener { replaceFragmentMain(HomeFragment()) }
        observeDataFlowers()

        return binding.root
    }

    private fun observeDataFlowers() {
        binding.rvFlowers.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.rvFlowers.adapter = adapter
        adapter.setItem(viewModel.getFlowers())
    }

    override fun getFlowersListener(flowers: Flowers) {

    }
}