package com.example.kaninistocks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.room.Room
import com.example.kaninistocks.UserData.UserDatabase
import com.google.android.material.textfield.TextInputLayout
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginMessage = findViewById<TextView>(R.id.loginMessage)

        val login =findViewById<Button>(R.id.LoginButton)
        val register = findViewById<Button>(R.id.RegiserButton)

        val userEmail =findViewById<TextInputLayout>(R.id.LoginEmailTextView)
        val userPassword = findViewById<TextInputLayout>(R.id.LoginPaswwordTextView)


        /*val db = Room.databaseBuilder(
            applicationContext,
            UserDatabase::class.java,"UserDetails"
        ).build()
        val dao = db.UserDao()*/



            register.setOnClickListener {

                    val intent = Intent(this, RegisterActivity::class.java)
                    startActivity(intent)


            }
            login.setOnClickListener {


                    val intentMain = Intent(this, MainActivity::class.java)
                    startActivity(intentMain)




            }


    }
}