package com.example.kaninistocks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var sessionManager: SessionManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sessionManager = SessionManager(this)


        val profileButton = findViewById<Button>(R.id.profileButton)
        val stock = findViewById<Button>(R.id.stockButton)
        val te =findViewById<TextView>(R.id.textView16)
        te.text=sessionManager.fetchAuthToken()


        profileButton.setOnClickListener{
            val intent = Intent(this, UserProfileActivity::class.java)
            startActivity(intent)

        }

        stock.setOnClickListener{
            val intent = Intent(this, StockBuyingActivity::class.java)
            startActivity(intent)

        }
    }
}