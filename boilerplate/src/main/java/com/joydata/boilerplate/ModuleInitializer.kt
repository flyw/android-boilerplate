package com.joydata.boilerplate

import android.content.Context
import android.util.Log
import androidx.startup.Initializer

class ModuleInitializer: Initializer<ModuleInitializer.Dependency> {
    private val TAG = javaClass.simpleName

    override fun create(context: Context): Dependency {
        println(javaClass.name + "#create()")
        return Dependency()
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return listOf(com.joydata.utils.ModuleInitializer::class.java)
    }

    class Dependency {
        init {
            isInitialized = true
        }

        companion object {
            var isInitialized = false
        }
    }

    //Reference:
    // https://proandroiddev.com/androidx-app-startup-698855342f80
    // https://github.com/husaynhakeem/android-playground/tree/master/StartupSample
    // https://developer.android.com/topic/libraries/app-startup
}