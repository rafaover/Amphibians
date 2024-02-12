package com.feeltheboard.amphibians

import com.feeltheboard.amphibians.fakedata.FakeNetworkAmphibiansRepository
import com.feeltheboard.amphibians.ui.AmphibiansViewModel
import org.junit.Test

class AmphibiansViewModelTest {

    @Test
    fun amphibiansViewModelTest_getAmphibiansData_verifyList() {
        val viewModel = AmphibiansViewModel(
            amphibiansDataRepository = FakeNetworkAmphibiansRepository()
        )
        // AssertEquals?
    }
}