package com.feeltheboard.amphibians.data

import com.feeltheboard.amphibians.network.AmphibiansApiService
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

interface AppContainer {
    val amphibiansRepository: AmphibiansDataRepository
}

class DefaultAppContainer: AppContainer {

    private val baseUrl = "https://android-kotlin-fun-mars-server.appspot.com"
    private val contentType = "application/json".toMediaType()
    private val retrofit= Retrofit.Builder()
        .addConverterFactory(Json.asConverterFactory(contentType))
        .baseUrl(baseUrl)
        .build()

    /** "lazy initialization" is when object creation is purposely delayed, until you actually need
    that object, to avoid unnecessary computation or use of other computing resources. */
    private val retrofitService : AmphibiansApiService by lazy {
        retrofit.create(AmphibiansApiService::class.java) }

    override val amphibiansRepository: AmphibiansDataRepository by lazy {
        NetworkAmphibiansDataRepository(retrofitService)
    }

}