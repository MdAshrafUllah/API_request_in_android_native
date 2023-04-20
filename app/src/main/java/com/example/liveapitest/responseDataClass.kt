package com.example.liveapitest

import PageInfo
import Product

data class ResponseDataClass(
    val PageInfo: PageInfo,
    val ProductList: List<Product>,
    val Success: Int,
    val error: Boolean
)