package com.example.laba1_compose

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun DownloadButton(){
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()

    val color = if (isPressed) Color(244, 209, 68) else Color(244, 209, 68, 200)
    val context = LocalContext.current
    Button(
        onClick = {
            Toast.makeText(context, "TODO", Toast.LENGTH_SHORT).show()
        },
        colors = ButtonDefaults.buttonColors(
            backgroundColor = color,
        ),
        modifier= Modifier
            .height(140.dp)
            .fillMaxWidth()
            .padding(start = 30.dp, end = 30.dp, bottom = 80.dp)
            .shadow(
                elevation = 15.dp,
                clip = false,
                shape = RoundedCornerShape(40.dp),
                spotColor = Color(244, 209, 68)
            )
            .clip(RoundedCornerShape(15.dp))
    ) {
        Text(
            text = stringResource(R.string.install_btn_text),
            fontSize = 20.sp
        )
    }
}
