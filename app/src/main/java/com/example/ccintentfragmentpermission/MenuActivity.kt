package com.example.ccintentfragmentpermission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        try {
            this.supportActionBar?.hide()
        } catch (e: NullPointerException) {}

        val bundle = intent.extras
        val nama = bundle?.getString("nama")

        tvVsPemain.setText(nama+" VS Pemain")
        tvVsCom.setText(nama+" VS Komputer")

        ivVsCom.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}