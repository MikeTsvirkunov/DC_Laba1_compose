package com.example.laba1_compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TagsRowFragment(tags_list: List<String>){
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(5.dp),
    ){
        items(tags_list.size){
            i -> TagLabel(text = tags_list[i])
        }
    }
}