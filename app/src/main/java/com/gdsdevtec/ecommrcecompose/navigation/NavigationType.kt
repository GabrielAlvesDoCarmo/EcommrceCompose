package com.gdsdevtec.ecommrcecompose.navigation

sealed class NavigationType {
    object NavigationTo : NavigationType()
    class PopUpTo(val inclusive: Boolean, val savedStateHandle: Pair<String, Any?>? = null) :NavigationType()
}//define o tipo de acaoo de navegacao se e voltar ou navegar
