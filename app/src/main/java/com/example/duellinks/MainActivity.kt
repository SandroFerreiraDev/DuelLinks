package com.example.duellinks

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.RelativeLayout
import androidx.core.view.WindowCompat
import com.example.duellinks.MenuActivity

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

        val goToMenu = findViewById<Button>(R.id.btnLogin)

        goToMenu.setOnClickListener {
            goToMenu()
        }
    }

    private fun goToMenu() {
        val intent = Intent(this, MenuActivity::class.java)
        startActivity(intent)
    }

}