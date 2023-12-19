package com.feeltheboard.amphibians.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.feeltheboard.amphibians.R
import com.feeltheboard.amphibians.ui.theme.AmphibiansTheme

@Composable
fun MainCard(modifier: Modifier = Modifier) {
    Card(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = stringResource(R.string.place_title),
            modifier = Modifier.padding(dimensionResource(R.dimen.text_margin))

        )
        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = null,
        )
        Text(
            text = stringResource(R.string.place_description),
            modifier = Modifier.padding(dimensionResource(R.dimen.text_margin))
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MainCardPreview() {
    AmphibiansTheme {
        MainCard()
    }
}