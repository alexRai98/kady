package com.app.kady.shared.ui

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.app.kady.ui.theme.GreyDisableButton
import com.app.kady.ui.theme.GreySoft
import com.app.kady.ui.theme.PoppinsTypography

@Composable
fun DefaultButton(
    text: String,
    color: Color,
    enabled: Boolean,
    ignoreClick: Boolean = false,
    textColor:Color = Color.White,
    icon: ImageVector,
    handleClick: () -> Unit
) {
    var click by rememberSaveable { mutableStateOf(false) }

    Button(
        enabled = enabled,
        onClick = {
            if (click && !ignoreClick) return@Button
            handleClick()
            click = true
        },
        colors = ButtonDefaults.buttonColors(
            containerColor = color,
            contentColor = Color.White,
            disabledContainerColor = GreyDisableButton,
            disabledContentColor = GreySoft,
        ),
        modifier = Modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(8.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = "$text icon",
            tint = Color.White,
            modifier = Modifier.size(25.dp)
        )
        Spacer(modifier = Modifier.width(12.dp))
        Text(text = text, style = PoppinsTypography.labelMedium, color = textColor)
    }
    LaunchedEffect(Unit) {
        click = false
    }
}