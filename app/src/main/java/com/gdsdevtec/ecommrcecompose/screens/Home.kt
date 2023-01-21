package com.gdsdevtec.ecommrcecompose.screens

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.gdsdevtec.ecommrcecompose.ui.components.EcommerceAppBar
import com.gdsdevtec.ecommrcecompose.utils.ConstantsScreen

@Composable
fun Home() {
    HomeScreen()
}

@Composable
fun HomeScreen() {
    Scaffold(
        topBar = { EcommerceAppBar(title =ConstantsScreen.HOME) {} },
        backgroundColor = Color.White
    ) {

    }
}

@Preview
@Composable
fun previewHomeScreen() {
    Home()
}
