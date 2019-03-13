package com.bharatmk257.ecomerceappkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_rv.*

class RVActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rv)

        var myProductsList = ArrayList<Eproduct>()
        myProductsList.add(Eproduct(0, "iPhone", 100, R.drawable.iphone))
        myProductsList.add(Eproduct(1, "Mac Book Air", 2000, R.drawable.macbookair))
        myProductsList.add(Eproduct(2, "Mac Book Pro", 5000, R.drawable.macbookpro))
        myProductsList.add(Eproduct(3, "Mac Pro", 2050, R.drawable.macpro))
        myProductsList.add(Eproduct(4, "I Mac", 3000, R.drawable.imac))
        myProductsList.add(Eproduct(5, "iPad", 1000, R.drawable.ipad))
        myProductsList.add(Eproduct(6, "iPod Nano", 100, R.drawable.ipodnano))
        myProductsList.add(Eproduct(7, "iPod Shuffle", 300, R.drawable.ipodshuffle))
        var rvAdapter = RVAdapter(this@RVActivity, myProductsList)

        recyclerView.layoutManager = LinearLayoutManager(this@RVActivity)
        recyclerView.adapter = rvAdapter

    }
}
