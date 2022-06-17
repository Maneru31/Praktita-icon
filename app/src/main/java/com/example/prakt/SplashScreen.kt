package com.example.prakt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        var handler = Handler()
        handler.postDelayed({
            if (App.dm.getFam() == ""){
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            } else {
                startActivity(Intent(this, SecondActivity::class.java))
            }
            finish()
        }, 3000) //delaing 3 seconds
    }
}