package com.alierdemalkoc.mybiography.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import com.alierdemalkoc.mybiography.adapter.GalleryCustomAdapter
import com.alierdemalkoc.mybiography.databinding.FragmentGalleryBinding
import com.alierdemalkoc.mybiography.service.GalleryService

class GalleryFragment : Fragment() {
    private var _binding : FragmentGalleryBinding? = null
    private val binding get() = _binding!!
    lateinit var gridView: GridView
    val galleryService = GalleryService()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGalleryBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        gridView = binding.galleryGrid
        val customAdapter = GalleryCustomAdapter(requireActivity(), galleryService.galleryResult())
        gridView.adapter = customAdapter

    }
}