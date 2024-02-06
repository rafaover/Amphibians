package com.feeltheboard.amphibians.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.feeltheboard.amphibians.data.NetworkAmphibiansDataRepository
import kotlinx.coroutines.launch
import java.io.IOException

sealed interface AmphibiansUiState {
    data class Success(val data: String): AmphibiansUiState
    object Loading: AmphibiansUiState
    object Error: AmphibiansUiState
}

class AmphibiansViewModel: ViewModel() {
    var amphibiansUiState: AmphibiansUiState by mutableStateOf(AmphibiansUiState.Loading)
        private set

    init {
        getAmphibiansData()
    }

    private fun getAmphibiansData() {
        try {
            viewModelScope.launch {
                val amphibiansDataRepository = NetworkAmphibiansDataRepository()
                val listResult = amphibiansDataRepository.getAmphibiansData()
                amphibiansUiState = AmphibiansUiState.Success("${listResult.size} insertions")
            }
        }
        catch (e: IOException) {
            amphibiansUiState = AmphibiansUiState.Error
        }
    }
}
