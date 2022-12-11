package com.amirmuhsin.template.view.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val splashScreen = installSplashScreen()

        splashScreen.setKeepOnScreenCondition { true }

        val handler = Handler(Looper.getMainLooper()) {
            val intent = Intent(this@SplashActivity, ScreenSlidePagerActivity::class.java)
            startActivity(intent)
            finish()
            false
        }
        handler.sendEmptyMessageDelayed(0, NEXT_ACTIVITY_DELAY_IN_SECONDS)

    }

    companion object {

        const val NEXT_ACTIVITY_DELAY_IN_SECONDS = 2_000L
    }
}