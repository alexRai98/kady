package com.app.kady.login.ui.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.app.kady.application.model.Routes
import com.app.kady.login.components.ui.Header
import com.app.kady.login.components.ui.LoginButton
import com.app.kady.login.components.ui.PasswordTextField
import com.app.kady.shared.model.UserTypeEnum
import com.app.kady.shared.ui.CustomCheckBox
import com.app.kady.shared.ui.GeneralDataInput
import com.app.kady.shared.ui.LabelTitle
import com.app.kady.ui.theme.GreenOliver


@Composable
fun LoginScreen(navigator: NavHostController, userType: UserTypeEnum) {
    val scrollState = rememberScrollState()
    var isRemember by remember { mutableStateOf(false) }
    var enabledButton by remember { mutableStateOf(false) }
    var useName by remember { mutableStateOf("") }
    var passWord by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .verticalScroll(state = scrollState)
    ) {
        Header(withCloseIcon = false) {
            navigator.navigate(Routes.WelcomeScreen.route)
        }
        Column(Modifier.padding(horizontal = 30.dp)) {
            Spacer(modifier = Modifier.size(35.dp))
            LabelTitle("Inicio de Sesión")
            Spacer(modifier = Modifier.size(20.dp))
            GeneralDataInput(
                placeholder = "Nombre de usuario",
                label = "Usuario",
                keyboardType = KeyboardType.Ascii,
                value = useName,
                onChange = { value ->
                    useName = value
                    enabledButton = validateUserNameAndPassword(value,passWord)
                }
            )
            Spacer(modifier = Modifier.height(30.dp))
            PasswordTextField(
                label = "Contraseña",
                password = passWord,
                placeholder = "Clave digital",
                helperText = ""
            ) { value ->
                passWord = value
                enabledButton = validateUserNameAndPassword(useName,value)
            }
            CustomCheckBox(
                isChecked = isRemember,
                label = "Recordar datos",
                checkedColor = GreenOliver,
                borderColor = Color.Black
            ) { isRemember = !isRemember }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Column(
            modifier = Modifier
                .height(150.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ) {
            LoginButton(
                enabledButton = enabledButton,
            ) {}
        }
    }

}

fun validateUserNameAndPassword(userName: String, password:String):Boolean{
    return userName.length >= 3 && password.length >= 3
}