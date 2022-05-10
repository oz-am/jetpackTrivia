package com.rig.jetpack.qcmapp.screnns.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rig.jetpack.qcmapp.R
import com.rig.jetpack.qcmapp.ui.theme.Violet

@Preview
@Composable
fun SplashScreen() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Violet)
    ) {
        Image(
            modifier = Modifier
                .fillMaxSize()
                .blur(50.dp),
            contentScale = ContentScale.FillHeight,
            painter = painterResource(id = R.drawable.t_bg),
            contentDescription = "spalsh background"
        )
        Text(
            modifier = Modifier.align(Alignment.Center),
            text = "TRIVIA\n WARS",
            style = MaterialTheme.typography.h4,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

        Button(
            modifier = Modifier.align(Alignment.BottomCenter).padding(0.dp, 40.dp),
            contentPadding = PaddingValues(25.dp, 5.dp),
            onClick = {},
            shape = RoundedCornerShape(30.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
            elevation = ButtonDefaults.elevation(5.dp),
        ) {
            Text(
                modifier = Modifier.padding(5.dp),
                text = "START PLAYING",
                style = MaterialTheme.typography.caption,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        }
    }
}

// @Preview
// @Composable
// fun SplashScreen() {
//    Surface(modifier = Modifier.background(Color.White)) {
//        Box(
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(250.dp)
//                .background(Color.White)
//        ) {
//            Spacer(modifier = Modifier.fillMaxWidth().height(220.dp).background(Color.Blue, RoundedCornerShape(10.dp)))
//            Spacer(
//                modifier = Modifier.height(60.dp).width(300.dp).background(
//                    Color.Red,
//                    RoundedCornerShape(10.dp)
//                ).align(
//                    Alignment.BottomCenter
//                )
//            )
//        }
//    }
// }
