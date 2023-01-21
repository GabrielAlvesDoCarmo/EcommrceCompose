package com.gdsdevtec.ecommrcecompose.screens

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.gdsdevtec.ecommrcecompose.ui.components.EcommerceAppBar

@Composable
fun Splash() {
    SplashScreen()
}

@Composable
fun SplashScreen() {
    Scaffold(
        topBar = { EcommerceAppBar(title = "Home") {} },
        backgroundColor = Color.White
    ) {

    }
}

@Preview
@Composable
fun previewSplashScreen() {
    Home()
}
