package com.example.laba1_compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun DownloadButton(){
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color(244, 209, 68)
        ),
        modifier=Modifier
            .height(140.dp)
            .fillMaxWidth()
            .padding(start = 30.dp, end = 30.dp, bottom = 80.dp)
            .clip(RoundedCornerShape(15.dp))
    ) {
        Text(
            text = "Install",
            fontSize = 20.sp
        )
    }
}
