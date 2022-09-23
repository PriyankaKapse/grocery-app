package com.example.mygroceryapp.model

data class MyPlaces(
    var html_attributions: Array<String>? = null,
    var status: String? = null,
    var results: Array<Results>? = null
)