package com.feeltheboard.amphibians.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.feeltheboard.amphibians.R
import com.feeltheboard.amphibians.network.Amphibians

@Composable
fun MainCard(
    amphibiansData: Amphibians    
) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
        shape = CardDefaults.shape,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            text = "${amphibiansData.name} (${amphibiansData.type})",
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            modifier = Modifier.padding(dimensionResource(R.dimen.text_margin))
        )
        AmphibianPhoto(amphibiansData)
        Text(
            text = amphibiansData.description,
            fontSize = 10.sp,
            modifier = Modifier.padding(dimensionResource(R.dimen.text_margin)),
            textAlign = TextAlign.Justify
        )
    }
}

//@Preview(showBackground = true)
//@Composable
//fun MainCardPreview() {
//    AmphibiansTheme {
//        MainCard()
//    }
//}