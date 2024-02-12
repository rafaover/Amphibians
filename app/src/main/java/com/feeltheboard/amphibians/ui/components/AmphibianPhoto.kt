package com.feeltheboard.amphibians.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.feeltheboard.amphibians.R
import com.feeltheboard.amphibians.network.Amphibians

@Composable
fun AmphibianPhoto(amphibiansData: Amphibians, modifier: Modifier = Modifier) {
    AsyncImage(
        model = ImageRequest.Builder(context = LocalContext.current)
            .data(amphibiansData.imgSrc)
            .crossfade(true)
            .build(),
        error = painterResource(R.drawable.ic_connection_error),
        placeholder = painterResource(R.drawable.loading_img),
        contentDescription = amphibiansData.description,
        modifier = Modifier.fillMaxWidth()
    )
}