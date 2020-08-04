package com.example.ccintentfragmentpermission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.example.ccintentfragmentpermission.databinding.ActivityLandingPageBinding

class LandingPageActivity : AppCompatActivity() {
    lateinit var binding: ActivityLandingPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLandingPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        try {
            this.supportActionBar?.hide()
        } catch (e: NullPointerException) {}

        supportFragmentManager.beginTransaction()
            .replace(R.id.landingPageContainer, LandingPage1())
            .commit()
    }

    fun ubahHalamanFragment2(){
        supportFragmentManager.beginTransaction()
            .replace(R.id.landingPageContainer, LandingPage2())
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .commit()
    }

    fun ubahHalamanFragment3(){
        supportFragmentManager.beginTransaction()
            .replace(R.id.landingPageContainer, LandingPage3())
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .commit()
    }
}