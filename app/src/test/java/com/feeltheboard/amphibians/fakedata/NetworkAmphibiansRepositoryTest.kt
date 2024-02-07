package com.feeltheboard.amphibians.fakedata

import com.feeltheboard.amphibians.data.NetworkAmphibiansDataRepository
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Test

class NetworkAmphibiansRepositoryTest {
    @Test
    fun networkAmphibiansRepositoryTest_getAmphibiansData_verifyList() {
        // runTest run as a coroutine test. Because of getAmphibiansData is a suspend function
        runTest {
            val repository = NetworkAmphibiansDataRepository(FakeApiService())
            assertEquals(FakeDataSource.amphibiansList, repository.getAmphibiansData())
        }
    }
}