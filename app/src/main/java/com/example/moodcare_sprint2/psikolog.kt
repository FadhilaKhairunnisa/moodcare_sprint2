package com.example.moodcare_sprint2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class psikolog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_psikolog)

        val nextbtn: View = findViewById<Button>(R.id.nextButton)

        nextbtn.setOnClickListener {
            val intent = Intent(this, metopem::class.java)
            startActivity(intent)
        }
    }
}