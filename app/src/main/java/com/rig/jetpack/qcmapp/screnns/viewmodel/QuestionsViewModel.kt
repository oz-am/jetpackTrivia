package com.rig.jetpack.qcmapp.screnns.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rig.jetpack.qcmapp.data.Resource
import com.rig.jetpack.qcmapp.model.QuestionItem
import com.rig.jetpack.qcmapp.repository.QuestionRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class QuestionsViewModel @Inject constructor(private val repository: QuestionRepository) : ViewModel() {
    val data: MutableState<Resource<ArrayList<QuestionItem>, Boolean, Exception>> = mutableStateOf(Resource(null, true, Exception("")))

    init {
        getAllQuestions()
    }

    private fun getAllQuestions() {
        viewModelScope.launch {
            data.value.loading = true
            data.value = repository.getAllQuestions()
            if (data.value.data.toString().isNotEmpty()) data.value.loading = false
        }
    }
}
