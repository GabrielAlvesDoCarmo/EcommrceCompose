package com.gdsdevtec.ecommrcecompose.di

import com.gdsdevtec.ecommrcecompose.navigation.NavigationManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import org.koin.dsl.module

val dataModule = module {
    single {
        CoroutineScope(Dispatchers.IO)
    }
}
val manager = module {
    single {
        NavigationManager(get())
    }
}

val allModule = dataModule + manager