package com.example.laba1_compose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laba1_compose.ui.theme.TextColor


@Composable
fun CommentsColumn(
    comment_data: List<CommentObject>
){
    LazyColumn() {
        items(comment_data.size){
            i -> CommentObject(
                image = comment_data[i].image,
                name = comment_data[i].name,
                date = comment_data[i].date,
                text = comment_data[i].text
            )
        }
    }
}