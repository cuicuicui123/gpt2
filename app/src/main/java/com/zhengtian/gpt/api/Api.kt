package com.zhengtian.gpt.api

import io.reactivex.rxjava3.core.Observable
import okhttp3.ResponseBody
import retrofit2.http.Field
import retrofit2.http.POST

interface Api {

    @POST("/api/v1/completion")
    fun ask(@Field("prompt") prompt: String): Observable<ResponseBody>
}