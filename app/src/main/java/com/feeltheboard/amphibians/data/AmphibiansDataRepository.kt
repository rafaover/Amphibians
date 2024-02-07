package com.feeltheboard.amphibians.data

import com.feeltheboard.amphibians.network.Amphibians
import com.feeltheboard.amphibians.network.AmphibiansApiService

interface AmphibiansDataRepository {
    suspend fun getAmphibiansData(): List<Amphibians>
}

class NetworkAmphibiansDataRepository(
    private val amphibiansApiService: AmphibiansApiService
): AmphibiansDataRepository {
    override suspend fun getAmphibiansData(): List<Amphibians> {
        return amphibiansApiService.getAmphibiansData()
    }
}