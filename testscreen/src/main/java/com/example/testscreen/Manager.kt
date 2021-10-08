package com.example.testscreen

import android.app.Activity
import android.app.Application
import android.content.Context
import android.content.Intent
import android.os.Bundle

object Manager : Application.ActivityLifecycleCallbacks {

    var buttonLabel: String = "Continuar"
    var title: String = ""
    var event: SnackShowEvent? = null
    private lateinit var mainActivityLib: MainActivityLib

    fun initMainActivityLib(context: Context) {
        val intent = Intent(context, MainActivityLib::class.java)
        context.startActivity(intent)
    }

    override fun onActivityCreated(p0: Activity, p1: Bundle?) {
        TODO("Not yet implemented")
    }

    override fun onActivityStarted(activity: Activity) {
        mainActivityLib = activity as MainActivityLib
    }

    override fun onActivityResumed(activity: Activity) {
        mainActivityLib.buttonContinue.text = buttonLabel
        mainActivityLib.buttonContinue.setOnClickListener(event)
        mainActivityLib.title = title
    }

    override fun onActivityPaused(p0: Activity) {
        TODO("Not yet implemented")
    }

    override fun onActivityStopped(p0: Activity) {
        TODO("Not yet implemented")
    }

    override fun onActivitySaveInstanceState(p0: Activity, p1: Bundle) {
        TODO("Not yet implemented")
    }

    override fun onActivityDestroyed(p0: Activity) {
        TODO("Not yet implemented")
    }
}