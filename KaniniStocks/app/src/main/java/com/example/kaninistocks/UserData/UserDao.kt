package com.example.kaninistocks.UserData

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction

@Dao
interface UserDao {
    @Insert
    fun insertNewUser(userDetails: UserDetails)

    @Transaction
    @Query("select customerId from UserDetails where customerEmail = :uEmail and pasword=:uPassword")
    fun isUserPresent(uEmail:String,uPassword:String):Int

}