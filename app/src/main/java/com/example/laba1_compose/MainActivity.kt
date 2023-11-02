package com.example.laba1_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.layoutId
import androidx.core.view.WindowCompat
import com.example.laba1_compose.ui.theme.LABA1_composeTheme
import com.example.laba1_compose.ui.theme.MainColor


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent{
            MainScreen()
        }
    }
}

private fun decoupledConstraints(): ConstraintSet {
    return ConstraintSet {
        val iconLabelRef = createRefFor("IconLabel")
        val headerImageRef = createRefFor("HeaderImage")
        val descriptionFragmentRef = createRefFor("DescriptionFragment")
        val gameGalleryRowRef = createRefFor("GameGalleryRow")
        val ratingFragmentRow = createRefFor("RatingFragment")
        constrain(headerImageRef) {
            top.linkTo(parent.top)
        }
        constrain(iconLabelRef) {
            top.linkTo(
                headerImageRef.bottom,
                margin = (-40).dp
            )
        }
        constrain(descriptionFragmentRef) {
            top.linkTo(
                iconLabelRef.bottom,
                margin = (10).dp
            )
        }
        constrain(gameGalleryRowRef) {
            top.linkTo(descriptionFragmentRef.bottom, margin = 10.dp)
        }
        constrain(ratingFragmentRow) {
            top.linkTo(gameGalleryRowRef.bottom, margin = 10.dp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreen() {
    LABA1_composeTheme {
        Surface(
            color = MainColor
        ){
            Spacer(modifier = Modifier
                .fillMaxSize()
                .background(color = MainColor))
        }
        LazyColumn() {
            item{
                ConstraintLayout(
                    constraintSet = decoupledConstraints()
                ) {
                    Box(
                        modifier = Modifier.layoutId("HeaderImage")
                    ) {
                        HeaderImageFragment()
                    }
                    Box(
                        modifier = Modifier.layoutId("IconLabel")
                    ) {
                        IconLabel()
                    }
                    Box(
                        modifier = Modifier.layoutId("DescriptionFragment")
                    ) {
                        DescriptionFragment()
                    }
                    Box(
                        modifier = Modifier.layoutId("GameGalleryRow")
                    ) {
                        GalleryFragment(
                            list_of_image_painters = mapOf(
                                "e1" to painterResource(R.drawable.example1),
                                "e2" to painterResource(R.drawable.example2),
                                "e3" to painterResource(R.drawable.example2)
                            )
                        )
                    }
                    Box(
                        modifier = Modifier.layoutId("RatingFragment")
                    ) {
                        RatingFragment(
                            rating = 4.9
                        )
                    }
                }

            }
        }
    }
}