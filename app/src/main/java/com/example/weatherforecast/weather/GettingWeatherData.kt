package com.example.weatherforecast.weather

import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley



class GettingWeatherData: AppCompatActivity(){

     fun getDataWeather(name: String){
        val url = "http://api.weatherapi.com/v1/current.json" +
                "?key=$API_KEY&q=$name&aqi=no"

         val queue = Volley.newRequestQueue(this)
        val stringRequest = StringRequest(Request.Method.GET, url,
            {
                response->
                   Log.d("MyLod", "Volley error: $response" )

            },
            {
                Log.d("MyLod", "Volley error: $it" )
            }
        )
        queue.add(stringRequest)
    }

    companion object{
        const val API_KEY = "70fd6316d1394c0099c165400222212"
    }
}