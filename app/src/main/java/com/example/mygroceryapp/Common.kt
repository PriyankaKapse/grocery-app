package com.example.mygroceryapp

import com.example.mygroceryapp.model.Results
import com.example.mygroceryapp.remote.IGoogleAPIService
import com.example.mygroceryapp.remote.RetrofitClient

const val GOOGLE_API_URL = "https://maps.googleapis.com/"

object Common {
    var currentResult: Results? = null
    val googleApiService: IGoogleAPIService
        get() = RetrofitClient.getClient(GOOGLE_API_URL).create(IGoogleAPIService::class.java)
}