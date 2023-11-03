package com.example.laba1_compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun TagLabel(text: String){
    Box (
        modifier = Modifier
            .clip(RoundedCornerShape(100))
            .background(
                color = Color(0x4444A9F4)
            )
    ){
        Text(
            text = text,
            color = Color(0xFF41A0E7),
            modifier = Modifier.padding(vertical = 5.dp, horizontal = 10.dp),
            fontSize = 10.sp
        )
    }
}

@Preview
@Composable
fun PreviewTagLabel(){
    TagLabel("Moba")
}