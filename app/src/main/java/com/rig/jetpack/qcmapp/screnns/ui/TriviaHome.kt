package com.rig.jetpack.qcmapp.screnns.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.rig.jetpack.qcmapp.screnns.viewmodel.QuestionsViewModel
import com.rig.jetpack.qcmapp.ui.theme.Violet

// fun TriviaHome(viewModel: QuestionsViewModel = hiltViewModel()) {

//    val questions = viewModel.data.value.data?.toMutableList()
//
//    if (viewModel.data.value.loading == true) {
//        CircularProgressIndicator()
//
//        Log.d("SIZE", "Questions: loading ....")
//    } else {
//        Log.d("SIZE", "Questions: Complete.")
//
//        Log.d("SIZE", "Questions: ${questions?.size}")
//    }

// }

@Preview
@Composable
fun TriviaHome(viewModel: QuestionsViewModel = hiltViewModel()) {

    val questions = viewModel.data.value.data?.toMutableList()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Violet)
            .padding(30.dp, 30.dp)
    ) {

        Card(
            modifier = Modifier
                .height(550.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(15.dp),
            backgroundColor = Color.White
        ) {

            if (viewModel.data.value.loading != true) {

                // Log.d("SIZE", "Questions: ${questions?.size}")
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp, 20.dp, 20.dp, 0.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = " test ")
                        Text(text = " test ")
                        Text(text = " test ")
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    // timer
                    Text(
                        modifier = Modifier
                            .size(40.dp)
                            .border(2.dp, Color.Black, shape = CircleShape),
                        text = ""
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        modifier = Modifier,
                        text = "Technology"
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        modifier = Modifier.padding(20.dp, 0.dp),
                        style = MaterialTheme.typography.h6,
                        fontWeight = FontWeight.Bold,
                        text = "What was the first product launched by Apple ?",
                        textAlign = TextAlign.Center
                    )
                }
            }
        }

        if (viewModel.data.value.loading == true) {
            CircularProgressIndicator(
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}
