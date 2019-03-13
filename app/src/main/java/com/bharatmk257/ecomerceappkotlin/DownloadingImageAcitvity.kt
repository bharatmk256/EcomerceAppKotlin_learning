package com.bharatmk257.ecomerceappkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_downloading_image.*

class DownloadingImageAcitvity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_downloading_image)


        btnDownloadImage.setOnClickListener {

            val imageURL = "http://192.168.0.104/mobile.jpg"

            Picasso.get().load(imageURL).into(imgDownloadedImage)

        }


    }
}
