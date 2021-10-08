package com.example.testscreen

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.annotation.RequiresApi

class MainActivityLib : AppCompatActivity() {

    lateinit var buttonContinue: Button

    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lib_activity_main)

        registerActivityLifecycleCallbacks(Manager)
        buttonContinue = findViewById(R.id.button_continue)
    }
}