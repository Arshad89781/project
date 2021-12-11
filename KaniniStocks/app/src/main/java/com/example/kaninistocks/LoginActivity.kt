package com.example.kaninistocks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.room.Room
import com.example.kaninistocks.userData.LoginDetails
import com.example.kaninistocks.userData.UserDetails

import com.google.android.material.textfield.TextInputLayout
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginMessage = findViewById<TextView>(R.id.loginMessage)

        val login =findViewById<Button>(R.id.LoginButton)
        val register = findViewById<Button>(R.id.RegiserButton)

        val userEmail =findViewById<TextInputLayout>(R.id.LoginEmailTextView)
        val userPassword = findViewById<TextInputLayout>(R.id.LoginPaswwordTextView)

        val myApplication = application as MyApplication
        val httpApiService = myApplication.httpApiService



        login.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

            register.setOnClickListener {

                    val intent = Intent(this, RegisterActivity::class.java)
                    startActivity(intent)


            }


                    




            }



}