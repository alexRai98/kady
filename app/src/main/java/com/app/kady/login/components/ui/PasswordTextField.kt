package com.app.kady.login.components.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Visibility
import androidx.compose.material.icons.outlined.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onKeyEvent
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import com.app.kady.ui.theme.GreenOliver
import com.app.kady.ui.theme.GreyPlaceHolder
import com.app.kady.ui.theme.PoppinsTypography

@Composable
fun PasswordTextField(
    label: String,
    password: String,
    helperText: String,
    helperColor: Color = Color.Black,
    placeholder: String = "",
    onChange: (String) -> Unit
) {
    var passwordVisible by rememberSaveable { mutableStateOf(false) }
    val keyboardController = LocalSoftwareKeyboardController.current

    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            text = label,
            style = PoppinsTypography.displaySmall,
            fontWeight = FontWeight.Medium,
            color = Color.Black
        )
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .onKeyEvent {
                    if (it.key == androidx.compose.ui.input.key.Key.Enter) {
                        false
                    }
                    false
                },
            value = password,
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color.White,
                focusedIndicatorColor = GreenOliver,
                focusedContainerColor = Color.White
            ),
            onValueChange = onChange,
            singleLine = true,
            visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Done,
                autoCorrect = false,
            ),
            keyboardActions = KeyboardActions(
                onDone = {
                    keyboardController?.hide()
                }
            ),
            trailingIcon = {
                val imageIcon =
                    if (passwordVisible) Icons.Outlined.Visibility else Icons.Outlined.VisibilityOff
                val description = if (passwordVisible) "Hide password" else "Show password"
                IconButton(onClick = { passwordVisible = !passwordVisible }) {
                    Icon(imageVector = imageIcon, description, tint = Color(0xFF484848))
                }
            },
            placeholder = {
                Text(
                    text = placeholder,
                    style = PoppinsTypography.displaySmall,
                    color = GreyPlaceHolder
                )
            }
        )
        Text(
            color = helperColor,
            text = helperText,
            style = PoppinsTypography.labelSmall
        )
    }
}