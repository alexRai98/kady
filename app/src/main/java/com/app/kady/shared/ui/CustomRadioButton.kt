package com.app.kady.shared.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.app.kady.ui.theme.GreenOliver
import com.app.kady.ui.theme.PoppinsTypography

@Composable
fun CustomRadioButton(
    value: Any,
    text: String,
    selected: Any?,
    onItemSelected: (Any) -> Unit,
    closeDialogDocumentType: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 15.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,

        ) {
        Text(modifier = Modifier.width(270.dp),text = text, color = Color.Black, style = PoppinsTypography.bodyMedium )
        RadioButton(
            selected = selected == value,
            onClick = {
                onItemSelected(value)
                closeDialogDocumentType()
            },
            colors = RadioButtonDefaults.colors(selectedColor = GreenOliver)
        )
    }
}