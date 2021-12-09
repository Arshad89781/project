package com.example.kaninistocks.UserData

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.util.*

@Entity(foreignKeys = arrayOf(ForeignKey(entity = UserDetails::class,
    parentColumns = arrayOf("customerId"),
    childColumns = arrayOf("customerId"),onDelete = ForeignKey.CASCADE)))
data class UserLoginDetails(

    @PrimaryKey(autoGenerate = true) val id:Int,
    val customerId:Int,
    //val time:Date?

    )
