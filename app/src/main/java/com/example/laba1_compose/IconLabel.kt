package com.example.laba1_compose

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.magnifier
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.layoutId
import com.example.laba1_compose.getters.getDownloadCount
import com.example.laba1_compose.getters.getRating
import com.example.laba1_compose.ui.theme.ReviewCounterColor
import com.example.laba1_compose.ui.theme.TextColor

@Preview
@Composable
fun IconLabel(){
    Box(
        modifier = Modifier
            .zIndex(20f)
            .height(125.dp)
    ){
        Column(
            modifier = Modifier.fillMaxWidth()
        ){

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End
            ) {
                Image(
                    painter = painterResource(R.drawable.logo_clear),
                    contentDescription = "Game logo",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.size(90.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column() {
                    Text(
                        text = "DoTA 2",
                        color = TextColor,
                        fontFamily = FontFamily(Font(R.font.natosan_bold)),
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(2.dp)
                    )
                    EasyStarsLabel(getRating())
                }
                Text(
                    text = getDownloadCount(),
                    color=ReviewCounterColor,
                    fontFamily = FontFamily(Font(R.font.natosan_thin)),
                    fontSize = 15.sp,
                    modifier = Modifier.padding(top = 38.dp, start = 10.dp)
                )
            }
        }
    }
}

private fun logoLabelConstraints(): ConstraintSet {
    return ConstraintSet {
        val (
            gameLogoRef,
            nameRef,
            starsRef,
            reviewCounterRef
        ) = createRefsFor("GameLogo", "Name", "Stars", "ReviewCounter")
        constrain(gameLogoRef) {
            start.linkTo(parent.start)
            top.linkTo(parent.top, 10.dp)
        }
        constrain(nameRef) {
            start.linkTo(gameLogoRef.end, margin = 100.dp)
            bottom.linkTo(starsRef.top)
        }
        constrain(starsRef) {
            start.linkTo(gameLogoRef.start, margin = 100.dp)
            bottom.linkTo(parent.bottom)
        }
        constrain(reviewCounterRef) {
            start.linkTo(starsRef.end, margin = 10.dp)
            bottom.linkTo(parent.bottom, margin = (-5).dp)
        }
    }
}

@Preview
@Composable
fun IconLabel2(){
    Box(
        modifier = Modifier
            .zIndex(20f)
            .height(125.dp)
    ){
        ConstraintLayout(
            constraintSet = logoLabelConstraints()
        ) {
            Image(
                painter = painterResource(R.drawable.logo_clear),
                contentDescription = stringResource(R.string.game_logo),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(90.dp)
            )
            Text(
                text = "DoTA 2",
                color = TextColor,
                fontFamily = FontFamily(Font(R.font.natosan_bold)),
                fontSize = 20.sp,
                modifier = Modifier
                    .layoutId("Name")
            )
            Box(modifier = Modifier.layoutId("Stars")){
                EasyStarsLabel(getRating())
            }
            Text(
                text = getDownloadCount(),
                color=ReviewCounterColor,
                fontFamily = FontFamily(Font(R.font.natosan_thin)),
                fontSize = 15.sp,
                modifier = Modifier.layoutId("ReviewCounter")
            )
        }
    }
}



@Preview
@Composable
fun PreviewIconLabel() {
    IconLabel2()
}