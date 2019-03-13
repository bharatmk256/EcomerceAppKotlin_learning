package com.bharatmk257.ecomerceappkotlin

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_show_all_jsonobjects.*

class ShowAllJSONObjectsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_all_jsonobjects)

        txtAllProducts.setBackgroundColor(Color.BLACK)
        txtAllProducts.setTextColor(Color.WHITE)

        txtAllProducts.setOnClickListener {

            val allProductsURL = "http://192.168.0.104/Ecommerce/present_json_array.php"

            var allProductsString: String = ""

            val requestQ: RequestQueue = Volley.newRequestQueue(this@ShowAllJSONObjectsActivity)

            val jsonAR = JsonArrayRequest(Request.Method.GET, allProductsURL, null, Response.Listener {

                    response ->

                for (productIndex in 0.until(response.length())) {

                    /*          allProductsString = allProductsString +
                                      response.getJSONObject(productIndex).getString(
                                          "name"
                                      ) + " - " +
                                      response.getJSONObject(productIndex).getInt(
                                          "price"
                                      )*/

                    var pn = response.getJSONObject(productIndex).getString("name")
                    var pp = response.getJSONObject(productIndex).getInt("price")

                    allProductsString = allProductsString + pn + " - " + pp + "\n"

                }

                txtAllProducts.text = allProductsString

            }, Response.ErrorListener { error ->

                txtAllProducts.text = error.message

            })

            requestQ.add(jsonAR)

        }

    }
}
