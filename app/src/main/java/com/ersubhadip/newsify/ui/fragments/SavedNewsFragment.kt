package com.ersubhadip.newsify.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ersubhadip.newsify.NewsActivity
import com.ersubhadip.newsify.R
import com.ersubhadip.newsify.databinding.FragmentSavedNewsBinding
import com.ersubhadip.newsify.viewmodel.NewsViewModel

class SavedNewsFragment : Fragment() {
    lateinit var binding: FragmentSavedNewsBinding
    lateinit var viewModel: NewsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSavedNewsBinding.inflate(inflater,container,false)


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = (activity as NewsActivity).newsViewModel
    }

}