package com.gdsdevtec.ecommrcecompose.di

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class EcommerceApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@EcommerceApplication)
            modules(allModule)
        }
    }
}