package com.example.laba1_compose

import androidx.compose.ui.graphics.painter.Painter
import java.util.*

class CommentObject(
    val image: Painter,
    val name: String,
    val date: Date,
    val text: String
)