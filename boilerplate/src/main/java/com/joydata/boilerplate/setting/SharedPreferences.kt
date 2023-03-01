package com.joydata.boilerplate.setting

import android.content.SharedPreferences as DefaultSharedPreferences
import androidx.preference.PreferenceManager
import com.joydata.utils.AppCtx

object SharedPreferences {

    private val sharedPrefs: DefaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(AppCtx.get())
    private val listener = DefaultSharedPreferences.OnSharedPreferenceChangeListener { _, key ->
        if (key == "boilerplate-example") { /* TODO dosomething */ }
    }

    init {
//        sharedPrefs.registerOnSharedPreferenceChangeListener(listener)
    }

    fun setExample(uuid: String) {
        sharedPrefs.edit().putString("boilerplate-example", uuid).apply()
    }

    fun getExample(): String? {
        return sharedPrefs.getString("boilerplate-example", "")
    }
}
