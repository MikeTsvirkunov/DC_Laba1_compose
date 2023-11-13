package com.example.laba1_compose

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.layoutId

val images_style = Modifier
    .height(125.dp)
    .width(275.dp)
    .padding(horizontal = 25.dp)
    .clip(
        RoundedCornerShape(20.dp)
    )

@Composable
fun GalleryFragment(
    list_of_image_painters: Map<String, Painter>,
//    id: String
){
//    Box(modifier = Modifier.layoutId(id)){
//        LazyRow(
//            userScrollEnabled = true,
//            modifier = Modifier.layoutId(id)
//        ){
//            items(list_of_image_painters.size){ i ->
//                Image(
//                    painter = list_of_image_painters[list_of_image_painters.keys.toList()[i]]!!,
//                    contentDescription = list_of_image_painters.keys.toList()[i],
//                    contentScale = ContentScale.FillBounds,
//                    modifier = images_style
//                )
//            }
//        }
//    }
    LazyRow(
        userScrollEnabled = true,
//        modifier = Modifier.layoutId(id)
    ){
        items(list_of_image_painters.size){ i ->
            Image(
                painter = list_of_image_painters[list_of_image_painters.keys.toList()[i]]!!,
                contentDescription = list_of_image_painters.keys.toList()[i],
                contentScale = ContentScale.Crop,
                modifier = images_style
            )
        }
    }
}

@Preview
@Composable
fun PreviewGalleryFragment() {
    GalleryFragment(
        list_of_image_painters = mapOf(
            "e1" to painterResource(R.drawable.example1),
            "e1" to painterResource(R.drawable.example2)
        )
    )
}