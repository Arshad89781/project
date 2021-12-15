package com.example.kaninistocks

import com.example.kaninistocks.userData.EmailChangeRequest
import com.example.kaninistocks.userData.LoginRequestData
import com.example.kaninistocks.userData.LoginRespondData
import com.example.kaninistocks.userData.RegisterRespond
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface ApiInterface {

    @POST("login")
    fun loginUser(@Body requestLogin: LoginRequestData): Call<LoginRespondData>?
    @POST("users/me/email")
    fun changeEmail(email:String):Call<Void>

    @POST("register")
     fun rigister(@Body requestLogin: LoginRequestData): Call<Void>?
}