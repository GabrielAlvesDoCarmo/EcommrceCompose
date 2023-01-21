package com.gdsdevtec.ecommrcecompose.screens

import android.os.Handler
import android.os.Looper
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.gdsdevtec.ecommrcecompose.navigation.Navigation
import com.gdsdevtec.ecommrcecompose.navigation.NavigationManager
import com.gdsdevtec.ecommrcecompose.navigation.Screen
import com.gdsdevtec.ecommrcecompose.ui.components.EcommerceAppBar
import com.gdsdevtec.ecommrcecompose.utils.ConstantsScreen
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

@Composable
fun Splash() {
    SplashScreen()
}

@Composable
fun SplashScreen() {
    val navController =NavigationManager()
    val dispatcher = LocalOnBackPressedDispatcherOwner.current?.onBackPressedDispatcher

    Scaffold(
        topBar = { EcommerceAppBar(title = ConstantsScreen.SPLASH) {
            dispatcher?.onBackPressed()
        } },
        backgroundColor = Color.White,
    ) {
        Column {
            Text(text = "Desenvolviemnto")
            Button(onClick = {}) {
            }

        }
    }
}

@Preview
@Composable
fun previewSplashScreen() {
    Splash()
}
