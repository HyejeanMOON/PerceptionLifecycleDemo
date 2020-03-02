package com.hyejeanmoon.perceptionlifecycledemo

import android.app.Application
import android.util.Log
import androidx.lifecycle.ProcessLifecycleOwner

class AndroidApplication : Application() {

    private var isAppActive = true

    private val TAG = "AndroidApplication"


    override fun onCreate() {
        super.onCreate()

        ProcessLifecycleOwner.get().lifecycle.addObserver(AppLifecycleObserver(object :
            AppLifecycleCallback {
            override fun onStart() {
                onForeground()
                Log.d(TAG, "onStart")
            }

            override fun onResume() {
                Log.d(TAG, "onResume")
            }

            override fun onCreate() {
                Log.d(TAG, "onCreate")
            }

            override fun onPause() {
                onBackground()
                Log.d(TAG, "onPause")
            }

            override fun onStop() {
                Log.d(TAG, "onStop")
            }

            override fun onDestroy() {
                Log.d(TAG, "onDestroy")
            }

            override fun onAny() {
                Log.d(TAG, "onAny")
            }
        }))

    }

    fun getAppStatus(): Boolean {
        return isAppActive
    }

    fun onBackground() {
        isAppActive = false
    }

    fun onForeground() {
        isAppActive = true
    }

}