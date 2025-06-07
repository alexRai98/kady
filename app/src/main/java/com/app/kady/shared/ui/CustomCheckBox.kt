package com.app.kady.shared.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.app.kady.ui.theme.PoppinsTypography

@Composable
fun CustomCheckBox(
    isChecked: Boolean,
    label: String,
    checkedColor: Color,
    borderColor: Color,
    spacer: Dp? = 8.dp,
    onChange: (Boolean) -> Unit
) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(start = 0.dp)
    ) {
        Checkbox(
            checked = isChecked,
            onCheckedChange = onChange,
            colors = CheckboxDefaults.colors(
                checkedColor = checkedColor,
                checkmarkColor = Color.White,
                uncheckedColor = borderColor
            ),
        )
        Spacer(modifier = Modifier.width(spacer ?: 8.dp))
        Text(
            text = label, style = PoppinsTypography.displaySmall,
            color = Color.Black
        )
    }
}