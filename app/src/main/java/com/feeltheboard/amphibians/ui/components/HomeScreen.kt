package com.feeltheboard.amphibians.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.feeltheboard.amphibians.R
import com.feeltheboard.amphibians.network.Amphibians
import com.feeltheboard.amphibians.ui.AmphibiansUiState
import kotlinx.serialization.json.JsonNull.content

@Composable
fun HomeScreen(
    amphibiansUiState: AmphibiansUiState,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues
) {
    when(amphibiansUiState) {
        is AmphibiansUiState.Success -> ResultScreen(
            amphibians = amphibiansUiState.data,
            contentPadding = contentPadding
        )
        is AmphibiansUiState.Loading -> LoadingScreen(modifier = modifier.fillMaxSize())
        is AmphibiansUiState.Error -> ErrorScreen(modifier = modifier.fillMaxSize())
    }
}

@Composable
fun ResultScreen(
    amphibians: List<Amphibians>,
    contentPadding: PaddingValues,
    modifier: Modifier = Modifier
){
    LazyColumn(
        contentPadding = contentPadding,
        verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_medium)),
        modifier = Modifier.padding(dimensionResource(R.dimen.padding_medium))
    ){
        items(amphibians) { amphibian ->
            MainCard(amphibian)
        }
    }
}

@Composable
fun LoadingScreen(modifier: Modifier = Modifier) {
    Image(
        modifier = modifier.size(200.dp),
        painter = painterResource(R.drawable.loading_img),
        contentDescription = stringResource(R.string.loading)
    )
}

@Composable
fun ErrorScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_connection_error),
            contentDescription = ""
        )
        Text(
            text = stringResource(R.string.loading_failed),
            modifier = Modifier.padding(16.dp)
        )
    }
}