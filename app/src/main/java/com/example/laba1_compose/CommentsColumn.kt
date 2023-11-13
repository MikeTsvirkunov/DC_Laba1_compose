package com.example.laba1_compose

import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.laba1_compose.objects.CommentObject


@Composable
fun CommentsColumn(
    comment_data: List<CommentObject>
){
    LazyColumn() {
        items(comment_data.size){
            i -> CommentFragment(
                image = comment_data[i].image,
                name = comment_data[i].name,
                date = comment_data[i].date,
                text = comment_data[i].text
            )
        }
    }
}
