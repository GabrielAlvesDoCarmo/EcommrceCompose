package com.gdsdevtec.ecommrcecompose.screens

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.gdsdevtec.ecommrcecompose.ui.components.EcommerceAppBar
import com.gdsdevtec.ecommrcecompose.utils.ConstantsScreen

@Composable
fun Login() {
    LoginScreen()
}

@Composable
fun LoginScreen() {
    Scaffold(
        topBar = { EcommerceAppBar(title = ConstantsScreen.LOGIN) {} },
        backgroundColor = Color.White
    ) {

    }
}

@Preview
@Composable
fun previewLoginScreen() {
    Login()
}
