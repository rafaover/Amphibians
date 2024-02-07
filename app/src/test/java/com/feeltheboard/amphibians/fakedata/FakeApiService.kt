package com.feeltheboard.amphibians.fakedata

import com.feeltheboard.amphibians.network.Amphibians
import com.feeltheboard.amphibians.network.AmphibiansApiService

class FakeApiService : AmphibiansApiService {
    override suspend fun getAmphibiansData(): List<Amphibians> {
        return FakeDataSource.amphibiansList
    }
}