package com.amirmuhsin.template.view.activity

import android.content.Intent
import android.os.Handler
import android.os.Looper
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.amirmuhsin.template.databinding.ActivitySplashBinding
import com.amirmuhsin.template.view.base.BaseActivity
import com.amirmuhsin.template.viewmodel.SplashViewModel

class SplashActivity : BaseActivity<ActivitySplashBinding, SplashViewModel>(ActivitySplashBinding::inflate) {

    override fun viewModelClass() = SplashViewModel::class.java

    override fun setupSplashScreen() {
        val splashScreen = installSplashScreen()

        splashScreen.setKeepOnScreenCondition { true }

        val handler = Handler(Looper.getMainLooper()) {
            val intent = Intent(this@SplashActivity, ScreenSlidePagerActivity::class.java)
            startActivity(intent)
            finish()
            false
        }
        handler.sendEmptyMessageDelayed(0, 2000)
    }

}