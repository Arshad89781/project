package com.example.kaninistocks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val profileButton = findViewById<Button>(R.id.profileButton)
        val stock = findViewById<Button>(R.id.stockButton)

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