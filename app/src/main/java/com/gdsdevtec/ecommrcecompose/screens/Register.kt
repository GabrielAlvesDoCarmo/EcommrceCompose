package com.gdsdevtec.ecommrcecompose.screens

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.gdsdevtec.ecommrcecompose.ui.components.EcommerceAppBar
import com.gdsdevtec.ecommrcecompose.utils.ConstantsScreen

@Composable
fun Register() {
    RegisterScreen()
}

@Composable
fun RegisterScreen() {
    Scaffold(
        topBar = { EcommerceAppBar(title = ConstantsScreen.REGISTER) {} },
        backgroundColor = Color.White
    ) {

    }
}

@Preview
@Composable
fun previewRegisterScreen() {
    Register()
}
