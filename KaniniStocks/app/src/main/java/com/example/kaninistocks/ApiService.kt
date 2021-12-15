package com.example.kaninistocks

import android.telecom.Call
import com.example.kaninistocks.userData.LoginRequest
import com.example.kaninistocks.userData.LoginRespond
import retrofit2.http.Body
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST


interface ApiService {
    @POST("login")
    @FormUrlEncoded
    fun login(@Body request: LoginRequest):retrofit2.Call<LoginRespond>
}