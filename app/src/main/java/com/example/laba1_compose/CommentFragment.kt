@file:Suppress("DEPRECATION")

package com.example.laba1_compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import java.util.Date


@Composable
fun CommentFragment(
    image: Painter,
    name: String,
    date: Date,
    text: String
){
    Box(){
        Column() {
            Row() {
                Image(
                    painter = image,
                    contentDescription = "image_$name",
                    modifier = Modifier
                        .clip(
                            RoundedCornerShape(40.dp)
                        )
                )
                Column() {
                    Text(text = name)
                    Text(text = "${date.month}, ${date.day}, ${date.year}")
                }
            }
            Text(
                text = text
            )
        }
    }
}