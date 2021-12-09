package com.example.kaninistocks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.room.Room
import com.example.kaninistocks.UserData.UserDatabase
import com.example.kaninistocks.UserData.UserDetails
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

        /*val db = Room.databaseBuilder(
            applicationContext,
            UserDatabase::class.java,"UserDetails"
        ).build()*/

        //val dao = db.UserDao()

        CoroutineScope(Dispatchers.IO).launch {


            newRegister.setOnClickListener {
                val newUser = UserDetails(
                    0,
                    newEmail.editText?.text.toString(),
                    newPassword.editText?.text.toString()
                )

                //dao.insertNewUser(newUser)

            }
        }


    }
}