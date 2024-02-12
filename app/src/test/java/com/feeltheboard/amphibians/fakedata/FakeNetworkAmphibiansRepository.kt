package com.feeltheboard.amphibians.fakedata

import com.feeltheboard.amphibians.data.AmphibiansDataRepository
import com.feeltheboard.amphibians.network.Amphibians

class FakeNetworkAmphibiansRepository: AmphibiansDataRepository {
    override suspend fun getAmphibiansData(): List<Amphibians> {
        return FakeDataSource.amphibiansList
    }
}