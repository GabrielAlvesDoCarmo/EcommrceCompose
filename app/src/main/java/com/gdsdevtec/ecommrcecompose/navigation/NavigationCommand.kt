package com.gdsdevtec.ecommrcecompose.navigation

import androidx.navigation.NavOptions

sealed class NavigationCommand {
    data class Navigate(
        val destination: String,
        val navOptions: NavOptions? = null,
        val type: NavigationType
    ) : NavigationCommand()

    object NavigateUp : NavigationCommand()

    object PopStackBack : NavigationCommand()

    object OnBackPressed : NavigationCommand()
}

// define os possiveis comandos de navegacao NavigateUp ,PopStackBack,OnBackPressed sao definicoes padroes de eventos
