package com.example.laba1_compose.getters

import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.ui.res.painterResource
import com.example.laba1_compose.R
import com.example.laba1_compose.objects.CommentObject
import java.util.*

import androidx.compose.ui.res.painterResource

//@Compose
fun getComments(): List<CommentObject>{
    return listOf(
        CommentObject(
            name = "Chel Number1",
            date = Date(),
            image = R.drawable.person1,
            text = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”"
        ),
        CommentObject(
            name = "Chel Number1",
            date = Date(),
            image = R.drawable.person1,
            text = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”"
        )
    )
}
