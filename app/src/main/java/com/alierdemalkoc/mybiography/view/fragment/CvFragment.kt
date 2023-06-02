package com.alierdemalkoc.mybiography.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alierdemalkoc.mybiography.R
import com.alierdemalkoc.mybiography.databinding.FragmentCvBinding

class CvFragment : Fragment() {
    private var _binding : FragmentCvBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCvBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }
}