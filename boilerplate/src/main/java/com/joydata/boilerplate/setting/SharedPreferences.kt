package com.joydata.boilerplate.setting

import android.content.SharedPreferences as DefaultSharedPreferences
import androidx.preference.PreferenceManager
import com.joydata.utils.AppCtx

object SharedPreferences {

    var sharedPrefs: DefaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(AppCtx.get())

    fun setExample(uuid: String) {
        sharedPrefs.edit().putString("boilerplate-example", uuid).apply()
    }

    fun getExample(): String? {
        return sharedPrefs.getString("boilerplate-example", "")
    }
}