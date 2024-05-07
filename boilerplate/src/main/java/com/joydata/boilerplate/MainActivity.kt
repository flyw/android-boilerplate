package com.digimeta.boilerplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.digimeta.utils.ui.SettingButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SettingButton(this).append()
    }
}
