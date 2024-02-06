package com.feeltheboard.amphibians.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.feeltheboard.amphibians.network.AmphibiansApi
import kotlinx.coroutines.launch

class AmphibiansViewModel: ViewModel() {
    var amphibiansUiState: String by mutableStateOf("")
        private set

    init {
        getAmphibiansData()
    }

    private fun getAmphibiansData() {
        viewModelScope.launch {
            val listResult = AmphibiansApi.retrofitService.getAmphibiansData()
            amphibiansUiState = listResult
        }
    }
}
