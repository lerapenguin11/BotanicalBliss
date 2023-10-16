package com.example.botanicalbliss.presentation

import android.app.Dialog
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
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
        binding.rvFlowers.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        binding.rvFlowers.adapter = adapter
        adapter.setItem(viewModel.getFlowers())
    }

    override fun getFlowersListener(flowers: Flowers) {
        val dialog = Dialog(requireContext(), android.R.style.Theme_DeviceDefault_Light_NoActionBar_Fullscreen)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(com.example.botanicalbliss.R.layout.full_screen_details_flowers)
        dialog.window?.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        dialog.window?.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        dialog.window?.statusBarColor = ContextCompat.getColor(requireContext(), android.R.color.transparent)

        val icon : ImageView = dialog.findViewById(com.example.botanicalbliss.R.id.ic_detail_flowers)
        val title : TextView = dialog.findViewById(com.example.botanicalbliss.R.id.tv_details_flowers_title)
        val description : TextView = dialog.findViewById(com.example.botanicalbliss.R.id.tv_details_flowers_desc)
        val close : ConstraintLayout = dialog.findViewById(com.example.botanicalbliss.R.id.bt_arrow)
        val rating : RatingBar = dialog.findViewById(R.id.ratingBar)
        val star : TextView = dialog.findViewById(R.id.tv_star)

        Glide.with(requireContext())
            .load(flowers.icon)
            .into(icon)

        title.text = flowers.title
        description.text = flowers.text
        rating.numStars = 5
        rating.rating = flowers.star.toFloat()
        star.setText(flowers.star.toString())

        dialog.show()

        close.setOnClickListener { dialog.cancel() }
    }
}