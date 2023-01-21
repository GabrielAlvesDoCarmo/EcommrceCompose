package com.gdsdevtec.ecommrcecompose.navigation

import androidx.activity.compose.LocalOnBackPressedDispatcherOwner
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.gdsdevtec.ecommrcecompose.screens.Home
import com.gdsdevtec.ecommrcecompose.screens.Login
import com.gdsdevtec.ecommrcecompose.screens.Register
import com.gdsdevtec.ecommrcecompose.screens.Splash
import com.gdsdevtec.ecommrcecompose.utils.ConstantsScreen.HOME
import com.gdsdevtec.ecommrcecompose.utils.ConstantsScreen.LOGIN
import com.gdsdevtec.ecommrcecompose.utils.ConstantsScreen.REGISTER
import com.gdsdevtec.ecommrcecompose.utils.ConstantsScreen.SPLASH
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.collectLatest

//funcao que navega
@Composable
fun Navigation(
    navController: NavHostController,
    startDestination: String = SPLASH,
    scope: CoroutineScope
) {
    ObserveNavigation(navController = navController, scope = scope)
    NavHost(navController = navController, startDestination = startDestination) {
        composable(Screen.Splash.route) { Splash() }
        composable(Screen.Home.route) { Home() }
        composable(Screen.Login.route) { Login() }
        composable(Screen.Register.route) { Register() }
    }
}

@Composable
fun ObserveNavigation(navController: NavHostController, scope: CoroutineScope) {
    val navigationManager: NavigationManager = NavigationManager(scope)
    val dispatcher = LocalOnBackPressedDispatcherOwner.current?.onBackPressedDispatcher

    LaunchedEffect(Unit) {
        navigationManager.navEvent.collectLatest { navCommand ->
            when (navCommand) {
                is NavigationCommand.Navigate -> {
                    when (navCommand.type) {
                        is NavigationType.NavigationTo -> {
                            navController.navigate(
                                route = navCommand.destination,
                                navOptions = navCommand.navOptions
                            )
                        }
                        is NavigationType.PopUpTo -> {
                            if (navCommand.type.savedStateHandle != null) {
                                val (key, value) = navCommand.type.savedStateHandle
                                navController.previousBackStackEntry?.savedStateHandle?.set(
                                    key,
                                    value
                                )
                            }
                            navController.popBackStack(
                                route = navCommand.destination,
                                inclusive = navCommand.type.inclusive
                            )
                        }
                    }
                }
                is NavigationCommand.NavigateUp -> navController.navigateUp()
                is NavigationCommand.PopStackBack -> navController.popBackStack()
                is NavigationCommand.OnBackPressed -> dispatcher?.onBackPressed()
            }
        }
    }
}
