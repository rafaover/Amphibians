package com.feeltheboard.amphibians.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.feeltheboard.amphibians.ui.components.AmphibianTopBar
import com.feeltheboard.amphibians.ui.components.HomeScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AmphibiansApp() {
    Scaffold(
        topBar = { AmphibianTopBar() }
    ) {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            val amphibiansViewModel: AmphibiansViewModel = viewModel()
            HomeScreen(
                amphibiansUiState = amphibiansViewModel.amphibiansUiState,
                contentPadding = it
            )
        }
    }
}