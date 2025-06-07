package com.app.kady.login.ui.welcome

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.app.kady.R
import com.app.kady.application.model.Routes
import com.app.kady.ui.theme.BackGroundPrincipal
import kotlinx.coroutines.delay

@Preview
@Composable
fun Test(){
    val navigationController = rememberNavController()

    SplashScreen(navigationController)
}

@Composable
fun SplashScreen(navController: NavHostController) {
    var startAnimation by remember { mutableStateOf(false) }
    val alphaAnim = animateFloatAsState(
        targetValue = if (startAnimation) 1f else 0f,
        animationSpec = tween(
            durationMillis = 1500
        ), label = ""
    )

    LaunchedEffect(key1 = true){
        startAnimation = true
        delay(2000)
        navController.popBackStack()
        navController.navigate(Routes.WelcomeScreen.route)
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = BackGroundPrincipal)
    ) {
        BodySplashScreen(Modifier.align(Alignment.Center), alpha = alphaAnim.value)
    }
}

@Composable
private fun BodySplashScreen(modifier: Modifier, alpha: Float) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {

        Image(
            painter = painterResource(id = R.drawable.logo_full),
            contentDescription = "name of sullana",
            modifier = Modifier
                .height(120.dp)
                .alpha(alpha)
        )
    }
}