package com.alierdemalkoc.mybiography.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import com.alierdemalkoc.mybiography.R
import com.alierdemalkoc.mybiography.databinding.FragmentBlogBinding

class BlogFragment : Fragment() {
    private var _binding : FragmentBlogBinding? = null
    private val binding get() = _binding!!
    lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBlogBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        webView = binding.blogWebView
        val url = "https://github.com/alierdemalkoc"

        webView.settings.javaScriptEnabled = true
        webView.loadUrl(url)
    }
}