package com.joydata.boilerplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.joydata.utils.ui.SettingButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SettingButton(this).append()
    }
}