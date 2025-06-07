package com.app.kady.application.model

sealed class Routes(val route: String) {
    object SplashScreen : Routes("splashScreen")
    object WelcomeScreen : Routes("welcomeScreen")
    object LoginScreen : Routes("loginScreen")
}