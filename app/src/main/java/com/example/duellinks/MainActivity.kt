package com.example.duellinks

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.RelativeLayout
import androidx.core.view.WindowCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val backgroundLayout = findViewById<RelativeLayout>(R.id.background_layout)
        val backgroundAnimation = AnimationUtils.loadAnimation(this, R.anim.login_background_animation)
        backgroundLayout.startAnimation(backgroundAnimation)


        WindowCompat.setDecorFitsSystemWindows(window, false)

        window.statusBarColor = Color.TRANSPARENT

        supportActionBar?.hide()


    }
}