package com.example.kaninistocks.UserData

import android.media.Image
import android.provider.ContactsContract
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class UserDetails(
    @PrimaryKey(autoGenerate = true) val customerId:Int,
    val customerEmail:String,
    val pasword:String,

)
