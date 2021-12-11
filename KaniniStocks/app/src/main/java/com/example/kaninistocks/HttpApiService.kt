package com.example.kaninistocks

import com.example.kaninistocks.userData.LoginDetails
import com.example.kaninistocks.userData.UserDetails
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface HttpApiService {
    @POST("/login")
    suspend fun userLogin(@Body details:LoginDetails):Response<UserDetails>
}