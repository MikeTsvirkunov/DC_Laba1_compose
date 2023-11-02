package com.example.laba1_compose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laba1_compose.ui.theme.TextColor

@Composable
fun RatingFragment(
    rating: Double,
){
    Box(
        modifier = Modifier.padding(10.dp)
    ) {
        Column() {
            Text(
                "Review & Ratings",
                color = TextColor
            )
            Row() {
                Text(
                    "$rating",
                    fontSize = 50.sp,
                    color = TextColor
                )
            }
        }
    }
}