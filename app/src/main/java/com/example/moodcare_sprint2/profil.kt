package com.example.moodcare_sprint2

import android.annotation.SuppressLint
import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import com.example.moodcare_sprint2.R

class profil : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        val chistoryButton: View = findViewById(R.id.consulHistoryButton)
        val metopemButton: View = findViewById(R.id.paymentButton)
        val logtbtn: View = findViewById(R.id.logoutButton)

        chistoryButton.setOnClickListener {
            val intent = Intent(this, RekamPsikolog::class.java)
            startActivity(intent)
        }

        metopemButton.setOnClickListener {
            val intent = Intent(this, metopem::class.java)
            startActivity(intent)
        }

        logtbtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}