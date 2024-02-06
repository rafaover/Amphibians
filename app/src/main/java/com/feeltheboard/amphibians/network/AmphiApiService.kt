package com.feeltheboard.amphibians.network

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.http.GET


private const val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com"

val contentType = "application/json".toMediaType()
private val retrofit= Retrofit.Builder()
    .addConverterFactory(Json.asConverterFactory(contentType))
    .baseUrl(BASE_URL)
    .build()

interface AmphibiansApiService {
    @GET("amphibians") //retrofit endpoint
    suspend fun getAmphibiansData(): List<Amphibians>
}

object AmphibiansApi {
    /** "lazy initialization" is when object creation is purposely delayed, until you actually need
    that object, to avoid unnecessary computation or use of other computing resources. */
    val retrofitService : AmphibiansApiService by lazy {
        retrofit.create(AmphibiansApiService::class.java) }
}