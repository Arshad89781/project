package com.example.kaninistocks.UserData

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [UserDetails::class,UserLoginDetails::class],version = 1,exportSchema = false)
abstract class UserDatabase:RoomDatabase() {
    abstract  fun UserDao():UserDao
}