package com.alierdemalkoc.mybiography.service

import com.alierdemalkoc.mybiography.model.Gallery

class GalleryService {

    fun galleryResult(): List<Gallery> {
        var list = mutableListOf<Gallery>()

        val g1 = Gallery("E-commerce","https://www.appindia.co.in/images/hero-9-image.png")
        val g2 = Gallery("Social","https://i.pinimg.com/originals/8c/76/af/8c76af88c6de0c548f46d665b717d93c.png")
        val g3 = Gallery("Note","https://www.sketchappsources.com/resources/source-image/notes-app-tomorr.png")
        val g4 = Gallery("Economy","https://conotoxia.com/images/currency-exchange/app-landing/phone-group-top-en.svg")
        val g5 = Gallery("E-commerce-2","https://www.appindia.co.in/images/hero-9-image.png")
        val g6 = Gallery("Social-2","https://i.pinimg.com/originals/8c/76/af/8c76af88c6de0c548f46d665b717d93c.png")
        val g7 = Gallery("Note-2","https://www.sketchappsources.com/resources/source-image/notes-app-tomorr.png")
        val g8 = Gallery("Economy-2","https://conotoxia.com/images/currency-exchange/app-landing/phone-group-top-en.svg")

        list.add(g1)
        list.add(g2)
        list.add(g3)
        list.add(g4)
        list.add(g5)
        list.add(g6)
        list.add(g7)
        list.add(g8)

        return list
    }

}