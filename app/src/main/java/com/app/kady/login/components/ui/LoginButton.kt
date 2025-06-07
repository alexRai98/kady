package com.app.kady.login.components.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Login
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.kady.shared.ui.DefaultButton
import com.app.kady.ui.theme.GreenOliver
import com.app.kady.ui.theme.GreyHelperButton
import com.app.kady.ui.theme.PoppinsTypography

@Composable
fun LoginButton(
    enabledButton: Boolean,
    handlerSubmit: () -> Unit,
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Box(
            modifier = Modifier
                .width(250.dp)
                .height(50.dp)
        ) {
            DefaultButton(text = "Ingresar", color = GreenOliver, enabled = enabledButton, icon = Icons.Outlined.Login) {
                handlerSubmit()
            }
        }

    }
    TextButton(onClick = {}) {
        Text(
            text = "¿Olvidaste tu contraseña?",
            style = PoppinsTypography.labelMedium,
            fontSize = 14.sp,
            color = GreyHelperButton
        )
    }
}