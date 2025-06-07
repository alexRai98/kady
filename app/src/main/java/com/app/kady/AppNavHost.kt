package com.app.kady

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavHostController
import com.app.kady.application.model.Routes
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.app.kady.login.ui.login.LoginScreen
import com.app.kady.login.ui.welcome.WelcomeScreen
import com.app.kady.login.ui.welcome.SplashScreen
import com.app.kady.shared.model.UserTypeEnum

@Composable
fun AppNavHost(navigationController: NavHostController) {
    var userType by remember { mutableStateOf(UserTypeEnum.STORE) }

    NavHost(
        navController = navigationController,
        startDestination = Routes.SplashScreen.route,
    ) {

        composable(Routes.SplashScreen.route) { SplashScreen(navigationController) }

        // welcome
        composable(Routes.WelcomeScreen.route) {
            WelcomeScreen(navigationController) { userTypeSelected ->
                userType = userTypeSelected
            }
        }

        //login
        composable(Routes.LoginScreen.route) {
            LoginScreen(navigationController, userType)
        }

    }
}

