package com.example.laba1_compose

import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laba1_compose.ui.theme.TextColor


@Composable
fun DescriptionFragment(){
    Text(text = "Dota 2 is a multiplayer online battle arena (MOBA) " +
            "game which has two teams of five players compete to " +
            "collectively destroy a large structure defended by " +
            "the opposing team known as the \"Ancient\", whilst" +
            " defending their own.",
        color = TextColor,
        modifier = Modifier.padding(20.dp, 0.dp, 0.dp, 0.dp),
        fontFamily = FontFamily(Font(R.font.natosan_thin)),
        fontSize = 12.sp
    )
}