package com.app.kady.login.components.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.outlined.Clear
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.app.kady.R
import com.app.kady.ui.theme.BackGroundPrincipal

@Composable
fun Header(withCloseIcon: Boolean, withAnyButtons: Boolean? = false, handlerChick: () -> Unit) {
    Box(
        modifier = Modifier
            .height(130.dp)
            .background(color = BackGroundPrincipal)
    ) {
        HeaderBody(withCloseIcon, withAnyButtons, handlerChick)
    }

}

@Composable
fun HeaderBody(withCloseIcon: Boolean, withAnyButtons: Boolean?, handlerChick: () -> Unit) {
    var click by rememberSaveable { mutableStateOf(false) }

    var arrangement = Arrangement.Start
    if (withCloseIcon) arrangement = Arrangement.End
    if (withAnyButtons == true) arrangement = Arrangement.Center
    Row(
        horizontalArrangement = arrangement,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 22.dp)
    ) {
        if (!withCloseIcon && withAnyButtons == false) {
            IconButton(onClick = {
                if (click) return@IconButton
                click = true
                handlerChick()
            }) {
                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    tint = Color.Black,
                    contentDescription = "back",
                    modifier = Modifier
                        .width(24.dp)
                        .height(24.dp)
                )
            }
            Spacer(modifier = Modifier.width(73.dp))
        }

        Image(
            painter = painterResource(id = R.drawable.logo_full),
            contentDescription = "logo",
            modifier = Modifier
                .width(118.dp)
        )
        if (withCloseIcon && withAnyButtons == false) {
            Spacer(modifier = Modifier.width(95.dp))
            IconButton(onClick = {
                if (click) return@IconButton
                click = true
                handlerChick()
            }) {
                Icon(
                    imageVector = Icons.Outlined.Clear,
                    tint = Color.Black,
                    contentDescription = "back",
                    modifier = Modifier
                        .width(24.dp)
                        .height(24.dp)
                )
            }
        }
    }
}

