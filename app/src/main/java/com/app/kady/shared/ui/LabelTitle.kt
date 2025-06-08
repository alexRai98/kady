package com.app.kady.shared.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun LabelTitle(value: String) {
    Text(
        text = value,
        fontSize = 20.sp, fontWeight = FontWeight.W500, color = Color.Black
    )
}