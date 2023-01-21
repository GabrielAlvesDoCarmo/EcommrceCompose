package com.gdsdevtec.ecommrcecompose.navigation

import com.gdsdevtec.ecommrcecompose.utils.ConstantsScreen.HOME
import com.gdsdevtec.ecommrcecompose.utils.ConstantsScreen.LOGIN
import com.gdsdevtec.ecommrcecompose.utils.ConstantsScreen.REGISTER
import com.gdsdevtec.ecommrcecompose.utils.ConstantsScreen.SPLASH

sealed class Screen(val route: String) {
    object Splash : Screen(SPLASH)
    object Home : Screen(HOME)
    object Login : Screen(LOGIN)
    object Register : Screen(REGISTER)
}