package com.example.liveapitest

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object retrofitinstance {

    private val retrofit by lazy {
        Retrofit.Builder().baseUrl("https://pqstec.com/").addConverterFactory(GsonConverterFactory.create()).build()
    }
    val apiinterface by lazy{
        retrofit.create(com.example.liveapitest.apiinterface::class.java)
    }

}