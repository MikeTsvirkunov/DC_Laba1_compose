package com.example.laba1_compose

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.magnifier
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.laba1_compose.ui.theme.TextColor

@Composable
fun IconLabel(){
    Box(
        modifier = Modifier
            .zIndex(20f)
            .height(125.dp)
    ){
        Column(
            modifier = Modifier.fillMaxWidth()
        ){

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End
            ) {
                Image(
                    painter = painterResource(R.drawable.logo),
                    contentDescription = "Game logo",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.size(125.dp)
                )
                Text(
                    text = "DoTA 2",
                    color = TextColor,
                    fontSize = 30.sp,
                    modifier = Modifier
                        .padding(2.dp)
                )
            }
        }
    }
}


@Preview
@Composable
fun PreviewIconLabel() {
    IconLabel()
}