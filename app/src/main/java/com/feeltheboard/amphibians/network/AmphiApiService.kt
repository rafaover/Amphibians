package com.feeltheboard.amphibians.network

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET


private const val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com"

private val retrofit= Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface AmphibiansApiService {
    @GET("amphibians") //retrofit endpoint
    suspend fun getAmphibiansData(): String
}

object AmphibiansApi {
    /** "lazy initialization" is when object creation is purposely delayed, until you actually need
    that object, to avoid unnecessary computation or use of other computing resources. */
    val retrofitService : AmphibiansApiService by lazy {
        retrofit.create(AmphibiansApiService::class.java) }
}