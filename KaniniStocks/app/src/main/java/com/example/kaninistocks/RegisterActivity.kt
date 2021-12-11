package com.example.kaninistocks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.room.Room

import com.google.android.material.textfield.TextInputLayout
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val newRegister = findViewById<Button>(R.id.NewRegiserButton)

        val newEmail = findViewById<TextInputLayout>(R.id.RegisterEmailTextView)
        val newPassword = findViewById<TextInputLayout>(R.id.RegisterPaswwordTextView)



        }



}