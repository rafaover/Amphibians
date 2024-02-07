package com.feeltheboard.amphibians.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.feeltheboard.amphibians.AmphibiansApplication
import com.feeltheboard.amphibians.data.AmphibiansDataRepository
import com.feeltheboard.amphibians.data.DefaultAppContainer
import kotlinx.coroutines.launch
import java.io.IOException

sealed interface AmphibiansUiState {
    data class Success(val data: String): AmphibiansUiState
    object Loading: AmphibiansUiState
    object Error: AmphibiansUiState
}

class AmphibiansViewModel(
    private val amphibiansDataRepository: AmphibiansDataRepository
): ViewModel() {
    var amphibiansUiState: AmphibiansUiState by mutableStateOf(AmphibiansUiState.Loading)
        private set

    init {
        getAmphibiansData()
    }

    private fun getAmphibiansData() {
        try {
            viewModelScope.launch {
                val listResult =
                    DefaultAppContainer().amphibiansRepository.getAmphibiansData()
                amphibiansUiState = AmphibiansUiState.Success("${listResult.size} insertions")
            }
        }
        catch (e: IOException) {
            amphibiansUiState = AmphibiansUiState.Error
        }
    }

    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val application = (this[APPLICATION_KEY] as AmphibiansApplication)
                val amphibiansDataRepository = application.container.amphibiansRepository
                AmphibiansViewModel(amphibiansDataRepository = amphibiansDataRepository)
            }
        }
    }
}
