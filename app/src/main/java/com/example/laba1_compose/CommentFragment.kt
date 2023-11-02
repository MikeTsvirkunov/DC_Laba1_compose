@file:Suppress("DEPRECATION")

package com.example.laba1_compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.util.Date
import com.example.laba1_compose.processors.commentDateProcessor
import com.example.laba1_compose.ui.theme.DateColor
import com.example.laba1_compose.ui.theme.TextColor


@Composable
fun CommentFragment(
    image: Int,
    name: String,
    date: Date,
    text: String
){
    Box(
        Modifier.padding(
            bottom = 30.dp,
            start = 30.dp,
            end = 30.dp
        )
    ){
        Column() {
            Row(
                Modifier.padding(bottom = 20.dp)
            ) {
                Image(
                    painter = painterResource(id = image),
                    contentDescription = "image_$name",
                    modifier = Modifier
                        .clip(
                            RoundedCornerShape(100.dp)
                        )
                        .size(60.dp)
                        .padding(end = 20.dp)
                )
                Column() {
                    Text(
                        text = name,
                        color = TextColor,
                        fontSize = 20.sp
                    )
                    Text(
                        text = commentDateProcessor(date = date),
                        color = DateColor,
                        fontSize = 15.sp
                    )
                }
            }
            Text(
                text = text,
                color = TextColor,
                fontSize = 15.sp
            )
        }
    }
}
