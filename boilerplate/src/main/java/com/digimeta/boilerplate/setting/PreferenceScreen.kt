package com.digimeta.boilerplate.setting

import android.content.Context
import android.text.InputType
import androidx.fragment.app.Fragment
import androidx.preference.*
import androidx.preference.PreferenceScreen
import com.digimeta.utils.setting.PreferenceScreenable

class PreferenceScreen (private val preferenceScreen: PreferenceScreen) : PreferenceScreenable {
    private val TAG: String = javaClass.simpleName

    lateinit var context: Context
    override fun onCreatePreferences(context: Context, fragment: Fragment) {
//        this.context = context
//        val category = PreferenceCategory(context)
//        category.title = "组标题"
//        preferenceScreen.addPreference(category)
//        category.addPreference(example())
    }

    private fun example(): Preference {
        val example = Preference(this.context)
        example.key = "boilerplate-example"
        example.title = "客户端编号"
        example.summary = SharedPreferences.getExample()
        return example
    }


}
