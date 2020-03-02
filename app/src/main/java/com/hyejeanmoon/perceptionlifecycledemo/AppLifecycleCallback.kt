package com.hyejeanmoon.perceptionlifecycledemo

interface AppLifecycleCallback {

    fun onStart()

    fun onStop()

    fun onCreate()

    fun onPause()

    fun onDestroy()

    fun onResume()

    fun onAny()
}