package com.gdsdevtec.ecommrcecompose.navigation

import androidx.navigation.NavOptionsBuilder
import androidx.navigation.navOptions
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.launch
//gerenciamento de acoes de navegacoao e emissao do evento
class NavigationManager {
    private val scope = CoroutineScope(Dispatchers.IO)
    var navEvent: MutableSharedFlow<NavigationCommand> = MutableSharedFlow()
        private set

    fun navigate(route: String, builder: (NavOptionsBuilder.() -> Unit)? = null) {
        scope.launch {
            navEvent.emit(
                NavigationCommand.Navigate(
                    destination = route,
                    type = NavigationType.NavigationTo,
                    navOptions =builder?.let { navOptions(it) }
                )
            )
        }
    }

    fun navigateUp() {
        scope.launch {
            navEvent.emit(NavigationCommand.NavigateUp)
        }
    }

    fun popStackBack(
        route: String,
        inclusive: Boolean,
        savedStateHandle: Pair<String, Any?>? = null
    ) {
        scope.launch {
            navEvent.emit(
                NavigationCommand.Navigate(
                    destination = route,
                    type = NavigationType.PopUpTo(inclusive, savedStateHandle)
                )
            )
        }
    }

    fun popStackBack() {
        scope.launch {
            navEvent.emit(NavigationCommand.PopStackBack)
        }
    }

    fun onBackPressed() {
        scope.launch {
            navEvent.emit(NavigationCommand.OnBackPressed)
        }
    }
}
