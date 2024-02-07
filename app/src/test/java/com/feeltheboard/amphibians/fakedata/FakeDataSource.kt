package com.feeltheboard.amphibians.fakedata

import com.feeltheboard.amphibians.network.Amphibians

object FakeDataSource {
    val amphibiansList = listOf(
        Amphibians("name1", "type1", "description1", "imgSrc1"),
        Amphibians("name2", "type2", "description2", "imgSrc2")
    )
}