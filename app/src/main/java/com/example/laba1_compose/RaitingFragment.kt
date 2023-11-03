package com.example.laba1_compose

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laba1_compose.getters.getDownloadCount
import com.example.laba1_compose.getters.getRating
import com.example.laba1_compose.ui.theme.ReviewCounterColor
import com.example.laba1_compose.ui.theme.TextColor

@Composable
fun RatingFragment(
    rating: Double,
){
    Box() {
        Column() {
            Text(
                "Review & Ratings",
                color = TextColor,
                fontWeight = FontWeight(900),
                fontFamily = FontFamily(Font(R.font.natosan_extrabold))
            )
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "$rating",
                    fontSize = 50.sp,
                    fontFamily = FontFamily(Font(R.font.natosan_medium)),
                    color = TextColor,
                    fontWeight = FontWeight(900)
                )
                Column(
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier.padding(start = 20.dp, top = 20.dp)
                ) {
                    EasyStarsLabel(getRating())
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        fontFamily = FontFamily(Font(R.font.natosan_thin)),
                        text = getDownloadCount() + " Reviews",
                        color= ReviewCounterColor,
                        fontSize = 15.sp,
                    )
                }
            }
        }
    }
}
