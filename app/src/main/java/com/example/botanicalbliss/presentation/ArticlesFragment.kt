package com.example.botanicalbliss.presentation

import android.app.Dialog
import android.graphics.Color
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.botanicalbliss.R
import com.example.botanicalbliss.databinding.FragmentArticlesBinding
import com.example.botanicalbliss.databinding.FragmentHomeBinding
import com.example.botanicalbliss.presentation.adapter.ArticlesAdapter
import com.example.botanicalbliss.presentation.listener.ArticlesListener
import com.example.botanicalbliss.utilits.replaceFragmentMain
import com.example.botanicalbliss.viewmodel.FlowersViewModel
import com.example.domain.entities.Articles
import org.koin.androidx.viewmodel.ext.android.viewModel

class ArticlesFragment : Fragment(), ArticlesListener{
    private var _binding : FragmentArticlesBinding? = null
    private val binding get() = _binding!!
    private val viewModel by viewModel<FlowersViewModel>()
    private val adapter = ArticlesAdapter(this)

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
        binding.rvArticles.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        binding.rvArticles.adapter = adapter
        adapter.setItem(viewModel.getArticle())
    }

    override fun getArticlesListener(art: Articles) {
        val dialog = Dialog(requireContext(), android.R.style.Theme_DeviceDefault_Light_NoActionBar_Fullscreen)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(com.example.botanicalbliss.R.layout.full_screen_details_articles)
        dialog.window?.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        dialog.window?.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        dialog.window?.statusBarColor = Color.TRANSPARENT

        val icon : ImageView = dialog.findViewById(com.example.botanicalbliss.R.id.ic_detail_art)
        val title : TextView = dialog.findViewById(com.example.botanicalbliss.R.id.tv_details_art_title)
        val description : TextView = dialog.findViewById(com.example.botanicalbliss.R.id.tv_details_art_desc)
        val close : ConstraintLayout = dialog.findViewById(com.example.botanicalbliss.R.id.bt_arrow)

        Glide.with(requireContext())
            .load(art.icon)
            .into(icon)

        title.text = art.title
        description.text = art.text
        dialog.show()

        close.setOnClickListener { dialog.cancel() }
    }
}