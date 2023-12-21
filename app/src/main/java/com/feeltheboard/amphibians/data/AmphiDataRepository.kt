package com.feeltheboard.amphibians.data

import com.feeltheboard.amphibians.network.AmphiApiService
import com.feeltheboard.amphibians.network.Amphibians

interface  AmphiDataRepository {
    suspend fun getAmphibians(): List<Amphibians>
}
class NetworkAmphiDataRepository(private val AmphiApiService: AmphiApiService): AmphiDataRepository {
    override suspend fun getAmphibians(): List<Amphibians> {
        return AmphiApiService.getAmphibiansData()
    }
}