package com.example.laba1_compose

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.unit.dp

@Composable
fun StarsLabel(){
    Canvas(modifier = Modifier
        .width(250.dp)
        .height(65.dp)
        .background(Color.Green)){
        drawRect(
            color = Color.Gray,
            topLeft = Offset(x = size.width / 3F, y = size.height / 3F),
            size = size / 3F
        )
        val path = Path()
        val x_s = size.width / 2f
        val y_s = size.height / 2f
        path.moveTo(x_s, y_s)
        path.lineTo(size.width / 2f, size.height / 2f)
        path.lineTo(size.width, 0f)
        path.close()
        drawPath(
            path,
            Color.Blue
        )
    }
}