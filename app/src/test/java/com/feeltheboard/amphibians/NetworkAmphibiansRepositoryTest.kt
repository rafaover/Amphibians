package com.feeltheboard.amphibians

import com.feeltheboard.amphibians.data.NetworkAmphibiansDataRepository
import com.feeltheboard.amphibians.fakedata.FakeApiService
import com.feeltheboard.amphibians.fakedata.FakeDataSource
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Test

class NetworkAmphibiansRepositoryTest {

    @Test
    fun networkAmphibiansRepositoryTest_getAmphibiansData_verifyList() {
        runTest {
            val repository = NetworkAmphibiansDataRepository(
                amphibiansApiService = FakeApiService()
            )
            assertEquals(FakeDataSource.amphibiansList, repository.getAmphibiansData())
        }
    }
}