package com.feeltheboard.amphibians.network

import retrofit2.http.GET

interface AmphibiansApiService {
    @GET("amphibians") //retrofit endpoint
    suspend fun getAmphibiansData(): List<Amphibians>
}