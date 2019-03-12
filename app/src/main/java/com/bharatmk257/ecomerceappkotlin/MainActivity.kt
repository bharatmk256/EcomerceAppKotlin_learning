package com.bharatmk257.ecomerceappkotlin

import android.content.SharedPreferences
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var sharedP: SharedPreferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGetData.setOnClickListener {

            var serverURL: String = "http://192.168.0.104/PHPTest/test_file.php"
            var requestQ: RequestQueue = Volley.newRequestQueue(this@MainActivity)
            var stringRequest = StringRequest(Request.Method.GET, serverURL,
                Response.Listener { response ->

                    txtHelloWorld.text = response

                }, Response.ErrorListener { error ->

                    txtHelloWorld.text = error.message
                    error.printStackTrace()

                })

            requestQ.add(stringRequest)

        }
    }
}
