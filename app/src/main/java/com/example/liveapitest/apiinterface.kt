package com.example.liveapitest

import com.example.liveapitest.ResponseDataClass
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header

interface apiinterface {
    @GET("invoiceapps/Values/GetProductList")
    fun getData(@Header("Authorization") authHeader: String): Call<ResponseDataClass>
    abstract fun getData(): Call<ResponseDataClass>
}
