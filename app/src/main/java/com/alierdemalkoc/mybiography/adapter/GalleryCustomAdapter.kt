package com.alierdemalkoc.mybiography.adapter

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.alierdemalkoc.mybiography.R
import com.alierdemalkoc.mybiography.model.Gallery
import com.bumptech.glide.Glide

class GalleryCustomAdapter(private val context: Activity, private val list: List<Gallery>) : ArrayAdapter<Gallery>(context, R.layout.custom_grid_item, list)
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val rootView = context.layoutInflater.inflate(R.layout.custom_grid_item, null, true)

        val r_title = rootView.findViewById<TextView>(R.id.item_name)
        val r_image = rootView.findViewById<ImageView>(R.id.grid_image)

        val gallery = list.get(position)

        r_title.text = "${gallery.name}"
        Glide.with(rootView).load(gallery.image).into(r_image)

        return rootView
    }
}