package com.hyejeanmoon.perceptionlifecycledemo

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onResume() {
        super.onResume()

        Log.d("MainActivity", "onResume")

        val app = application as AndroidApplication
        Log.d("MainActivity", app.getAppStatus().toString())
        if (app.getAppStatus()) {
            Log.d("MainActivity", "onResume work")
            Toast.makeText(this, "App is in Foreground", Toast.LENGTH_LONG).show()
        }
    }

}
