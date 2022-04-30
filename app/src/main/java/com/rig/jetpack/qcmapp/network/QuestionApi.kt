package com.rig.jetpack.qcmapp.network

import com.rig.jetpack.qcmapp.model.Question
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface QuestionApi {
    @GET("world.json")
    suspend fun getAllQuestions(): Question
}
