package com.rig.jetpack.qcmapp.component

import android.util.Log
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import com.rig.jetpack.qcmapp.screnns.viewmodel.QuestionsViewModel

@Composable
fun Questions(viewModel: QuestionsViewModel) {
    val questions = viewModel.data.value.data?.toMutableList()

    if (viewModel.data.value.loading == true) {
        CircularProgressIndicator()

        Log.d("SIZE", "Questions: loading ....")
    } else {
        Log.d("SIZE", "Questions: Complete.")

        Log.d("SIZE", "Questions: ${questions?.size}")
    }
}
