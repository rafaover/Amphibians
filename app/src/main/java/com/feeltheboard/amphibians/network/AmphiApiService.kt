package com.feeltheboard.amphibians.network

import retrofit2.http.GET

interface AmphiApiService {
    @GET("amphibians")
    suspend fun getAmphibiansData(): List<Amphibians>
}