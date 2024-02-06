package com.feeltheboard.amphibians.data

import com.feeltheboard.amphibians.network.Amphibians
import com.feeltheboard.amphibians.network.AmphibiansApi

interface AmphibiansDataRepository {
    suspend fun getAmphibiansData(): List<Amphibians>
}

class NetworkAmphibiansDataRepository: AmphibiansDataRepository {
    override suspend fun getAmphibiansData(): List<Amphibians> {
        return AmphibiansApi.retrofitService.getAmphibiansData()
    }
}