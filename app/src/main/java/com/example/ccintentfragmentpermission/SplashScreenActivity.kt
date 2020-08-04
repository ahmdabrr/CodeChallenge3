package com.example.ccintentfragmentpermission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

@Suppress("DEPRECATION")
class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        try {
            this.supportActionBar?.hide()
        } catch (e: NullPointerException) {}

        val handler = Handler()

        handler.postDelayed({
            startActivity(Intent(this, LandingPageActivity::class.java))
            finish()
        }, 1000)
    }
}