package com.gdsdevtec.ecommrcecompose.di

import com.gdsdevtec.ecommrcecompose.navigation.NavigationManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import org.koin.dsl.module

val manager = module {
    single {
        NavigationManager()
    }
}

val allModule =  manager