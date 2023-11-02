package com.example.laba1_compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun HeaderImageFragment(){
    Image(
        painter = painterResource(R.drawable.main_label),
        contentDescription = "Game label",
        contentScale = ContentScale.FillWidth,
        modifier = Modifier
            .height(250.dp)
            .fillMaxWidth()
    )
}