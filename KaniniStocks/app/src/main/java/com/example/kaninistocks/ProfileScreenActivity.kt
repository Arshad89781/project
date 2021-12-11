package com.example.kaninistocks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ProfileScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_screen)

        val deleteAccount = findViewById<Button>(R.id.deleteAccountButton)
        val changeEmail = findViewById<Button>(R.id.changeEmailButton)
        val loginHistory = findViewById<Button>(R.id.ReviewButton)

        deleteAccount.setOnClickListener{
            val intent = Intent(this, AccountDeleteActivity::class.java)
            startActivity(intent)

        }

        changeEmail.setOnClickListener{
            val intent = Intent(this, ChangeEmailActivity::class.java)
            startActivity(intent)

        }

        loginHistory.setOnClickListener{
            val intent = Intent(this, LoginHistoryActivity::class.java)
            startActivity(intent)

        }
    }
}