package com.feeltheboard.amphibians.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.feeltheboard.amphibians.R
import com.feeltheboard.amphibians.ui.theme.AmphibiansTheme

@Composable
fun MainCard(
    title: String,
    description: String
) {
    Card(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        modifier = Modifier
            .fillMaxWidth()
            .background(colorResource(id = R.color.purple_200)),
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp,
            modifier = Modifier
                .padding(dimensionResource(R.dimen.text_margin))

        )
        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()

        )
        Text(
            text = description,
            modifier = Modifier.padding(dimensionResource(R.dimen.text_margin)),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MainCardPreview() {
    AmphibiansTheme {
        MainCard(title = "Title", description = "Description")
    }
}