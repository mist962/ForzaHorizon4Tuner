package com.sideki.forzahorizon4tuner.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sideki.forzahorizon4tuner.MainActivity

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent(baseContext, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}