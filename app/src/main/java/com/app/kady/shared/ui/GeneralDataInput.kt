package com.app.kady.shared.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onKeyEvent
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.sp
import com.app.kady.ui.theme.GreenOliver
import com.app.kady.ui.theme.GreyPlaceHolder
import com.app.kady.ui.theme.PoppinsTypography

@Composable
fun GeneralDataInput(
    placeholder: String,
    label: String,
    value: String,
    keyboardType: KeyboardType,
    enabled: Boolean = true,
    onChange: (String) -> Unit,
) {
    val keyboardController = LocalSoftwareKeyboardController.current

    Column() {
        if (label.isNotEmpty()) {
            Text(
                text = label,
                style = PoppinsTypography.labelMedium,
                color = Color.Black,
                fontSize = 14.sp
            )
        }

        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .onKeyEvent {
                    if (it.key == androidx.compose.ui.input.key.Key.Enter) {
                        false
                    }
                    false
                },
            value = value,
            onValueChange = onChange,
            singleLine = true,
            enabled = enabled,
            colors = TextFieldDefaults.colors(unfocusedContainerColor = Color.White, focusedIndicatorColor = GreenOliver,
                focusedContainerColor = Color.White),
            placeholder = {
                Text(
                    text = placeholder,
                    style = PoppinsTypography.displaySmall,
                    color = GreyPlaceHolder
                )
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = keyboardType,
                imeAction = ImeAction.Done,
                autoCorrect = false,
            ),
            keyboardActions = KeyboardActions(
                onDone = {
                    keyboardController?.hide()
                }
            ),
        )
    }

}
