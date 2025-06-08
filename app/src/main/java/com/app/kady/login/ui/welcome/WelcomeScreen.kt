package com.app.kady.login.ui.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.DeliveryDining
import androidx.compose.material.icons.outlined.PersonOutline
import androidx.compose.material.icons.outlined.Store
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.app.kady.R
import com.app.kady.application.model.Routes
import com.app.kady.shared.model.UserTypeEnum
import com.app.kady.shared.ui.DefaultButton
import com.app.kady.ui.theme.BackGroundPrincipal
import com.app.kady.ui.theme.BrownOliver
import com.app.kady.ui.theme.GreenOliver
import com.app.kady.ui.theme.PoppinsTypography


@Composable
fun WelcomeScreen(navigator: NavHostController,selectUserType: (UserTypeEnum)->Unit) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = BackGroundPrincipal)
            .padding(top = 100.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_full),
                contentDescription = "logo",
                modifier = Modifier
                    .width(180.dp)
            )
            Text(
                text = "V 1.0",
                color = Color.Black,
                modifier = Modifier
                    .width(252.dp)
                    .offset(y = ((-23).dp)),
                textAlign = TextAlign.End
            )
        }
        Spacer(modifier = Modifier.size(80.dp))
        Body(navigator,selectUserType)
    }
}

@Composable
private fun Body(navigator: NavHostController,selectUserType: (UserTypeEnum)->Unit) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp)
            .padding(horizontal = 28.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "Selecciona tu rol",
                style = PoppinsTypography.displayMedium,
                color = BrownOliver
            )
        }
        Spacer(modifier = Modifier.size(20.dp))
        DefaultButton(
            text = "Cliente",
            color = GreenOliver,
            enabled = true,
            icon = Icons.Outlined.PersonOutline,
            handleClick = {
                navigator.navigate(Routes.LoginScreen.route)
                selectUserType(UserTypeEnum.CLIENT)
            })
        DefaultButton(
            text = "Negocio",
            color = GreenOliver,
            enabled = true,
            icon = Icons.Outlined.Store,
            handleClick = {
                navigator.navigate(Routes.LoginScreen.route)
                selectUserType(UserTypeEnum.STORE)
            })
        DefaultButton(
            text = "Delivery",
            color = GreenOliver,
            enabled = true,
            icon =  Icons.Outlined.DeliveryDining,
            handleClick = {
                navigator.navigate(Routes.LoginScreen.route)
                selectUserType(UserTypeEnum.DELIVERY)
            })
    }
}