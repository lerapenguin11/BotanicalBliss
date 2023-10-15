package com.example.botanicalbliss.presentation

import android.app.Dialog
import android.graphics.Color
import android.graphics.ImageDecoder
import android.graphics.drawable.ColorDrawable
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.botanicalbliss.R
import com.example.botanicalbliss.databinding.FragmentHomeBinding
import com.example.botanicalbliss.presentation.adapter.PhotoAdapter
import com.example.botanicalbliss.presentation.adapter.TopArticleAdapter
import com.example.botanicalbliss.presentation.listener.ArticlesListener
import com.example.botanicalbliss.presentation.listener.PhotoListener
import com.example.botanicalbliss.utilits.replaceFragmentMain
import com.example.botanicalbliss.viewmodel.FlowersViewModel
import com.example.domain.entities.Articles
import com.example.domain.entities.Photo
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment :
    Fragment(),
    ArticlesListener,
    PhotoListener {
    private var _binding : FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private val viewModel by viewModel<FlowersViewModel>()
    private val adapterTop = TopArticleAdapter(this)
    private val adapterPhoto = PhotoAdapter(this)

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

    override fun getArticlesListener(art: Articles) {

    }

    override fun getPhotoListener(photo: Photo) {
        val dialog = context?.let { Dialog(it) }
        dialog?.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog?.setCancelable(false)
        dialog?.setContentView(R.layout.dialog_photo)
        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val close : ConstraintLayout = dialog!!.findViewById(R.id.bt_close)
        val icon : ImageView = dialog.findViewById(R.id.ic_flowers)
        val tag : TextView = dialog.findViewById(R.id.tv_photo_tag)

        Glide.with(requireContext())
            .load(photo.icon)
            .into(icon)

        tag.text = photo.tag

        dialog.show()

        close.setOnClickListener { dialog.cancel() }
    }
}