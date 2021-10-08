package com.example.testlib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.testscreen.Manager
import com.example.testscreen.SnackShowEvent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button_init)
        button.setOnClickListener {
            configManager()
        }
    }

    private fun configManager() {
        val manager = Manager
        manager.buttonLabel = "Presione aquí"
        manager.title = "Prueba"
        manager.event = SnackShowEvent()
        manager.initMainActivityLib(this)
    }

}