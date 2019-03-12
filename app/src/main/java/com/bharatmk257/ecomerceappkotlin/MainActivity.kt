package com.bharatmk257.ecomerceappkotlin

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var sharedP : SharedPreferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnAdd.setOnClickListener {

            sharedP = getSharedPreferences("addData", Context.MODE_PRIVATE)
            var myEditor = sharedP?.edit()
            myEditor?.putString("product_name", edtProduct.text.toString())
            myEditor?.commit()

        }

        btnGetProduct.setOnClickListener {

            txtGetProduct.text = sharedP?.getString("product_name", "")

        }
    }
}
