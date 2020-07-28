package com.joydata.boilerplate.setting

import android.content.SharedPreferences
import androidx.preference.PreferenceManager
import com.joydata.utils.AppCtx
import java.lang.StringBuilder
import java.util.*
import kotlin.collections.HashSet

class SharedPreferences {

    var sharedPrefs: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(AppCtx.get())

    fun setExample(uuid: String) {
        sharedPrefs.edit().putString("boilerplate-example", uuid).apply()
    }

    fun getExample(): String? {
        return sharedPrefs.getString("boilerplate-example", "")
    }
}