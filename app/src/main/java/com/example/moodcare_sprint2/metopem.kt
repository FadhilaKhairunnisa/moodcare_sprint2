package com.example.moodcare_sprint2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class metopem : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_metopem)

        val bankBCA: TextView = findViewById(R.id.bcatext)
        val bankBRI: TextView = findViewById(R.id.britext)
        val bankMandiri: TextView = findViewById(R.id.mandiritext)
        val ewalletlinkaja: TextView = findViewById(R.id.linkajatext)
        val ewalletdana: TextView = findViewById(R.id.danatext)

        bankBCA.setOnClickListener {
            val intent = Intent(this, metopembca::class.java)
            startActivity(intent)
        }

        bankBRI.setOnClickListener {
            val intent = Intent(this, metopembri::class.java)
            startActivity(intent)
        }

        bankMandiri.setOnClickListener {
            val intent = Intent(this, metopemmandiri::class.java)
            startActivity(intent)
        }

        ewalletlinkaja.setOnClickListener {
            val intent = Intent(this, metopemlinkaja::class.java)
            startActivity(intent)
        }

        ewalletdana.setOnClickListener {
            val intent = Intent(this, metopemdana::class.java)
            startActivity(intent)
        }
    }
}