package com.feeltheboard.amphibians

import android.app.Application
import com.feeltheboard.amphibians.data.AppContainer
import com.feeltheboard.amphibians.data.DefaultAppContainer

class AmphibiansApplication: Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}