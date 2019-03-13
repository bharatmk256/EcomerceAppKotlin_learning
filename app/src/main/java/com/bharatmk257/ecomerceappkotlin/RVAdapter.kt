package com.bharatmk257.ecomerceappkotlin

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class RVAdapter(var context: Context, var arrayList: ArrayList<Eproduct>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        var productView = LayoutInflater.from(context).inflate(R.layout.rv_row, parent, false)
        return ProductViewHolder(productView)

    }

    override fun getItemCount(): Int {

        return arrayList.size

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        (holder as ProductViewHolder).initializeUIComponents(
            arrayList[position].id,
            arrayList[position].name,
            arrayList[position].price,
            arrayList[position].productPicture
        )

    }


    inner class ProductViewHolder(myView: View) : RecyclerView.ViewHolder(myView) {

        var pIDTextView = myView.findViewById<TextView>(R.id.rv_row_product_id)
        var pNameTextView = myView.findViewById<TextView>(R.id.rv_row_product_name)
        var pPriceTextView = myView.findViewById<TextView>(R.id.rv_row_product_price)
        var pImageView = myView.findViewById<ImageView>(R.id.rv_row_product_image)

        fun initializeUIComponents(pID: Int, pName: String, pPrice: Int, pImage: Int) {

            pIDTextView.text = pID.toString()
            pNameTextView.text = pName
            pPriceTextView.text = pPrice.toString()
            pImageView.setImageResource(pImage)

        }

    }

}