package com.app.kady

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.app.kady.application.model.Routes
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.app.kady.login.ui.loginScreen.WelcomeScreen
import com.app.kady.login.ui.loginScreen.SplashScreen

@Composable
fun AppNavHost(navigationController: NavHostController) {
    NavHost(
        navController = navigationController,
        startDestination = Routes.SplashScreen.route,
    ) {
        composable(Routes.SplashScreen.route) { SplashScreen(navigationController) }

        // login
        composable(Routes.LoginScreen.route) {
            WelcomeScreen()
        }

    }
}