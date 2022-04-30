package com.rig.jetpack.qcmapp.repository

import android.util.Log
import com.rig.jetpack.qcmapp.data.Resource
import com.rig.jetpack.qcmapp.model.QuestionItem
import com.rig.jetpack.qcmapp.network.QuestionApi
import javax.inject.Inject

class QuestionRepository @Inject constructor(private val api: QuestionApi) {
    private val resource = Resource<ArrayList<QuestionItem>, Boolean, Exception>()

    suspend fun getAllQuestions(): Resource<ArrayList<QuestionItem>, Boolean, Exception> {
        try {
            resource.loading = true
            resource.data = api.getAllQuestions()
            if (resource.data.toString().isNullOrEmpty()) resource.loading = false
        } catch (e: Exception) {
            resource.error = e
            Log.e("Exc", "getAllQuestions: ${resource.error!!.localizedMessage}")
        }

        return resource
    }
}
