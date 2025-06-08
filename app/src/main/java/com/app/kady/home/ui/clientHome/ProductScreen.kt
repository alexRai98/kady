package com.app.kady.home.ui.clientHome

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.kady.R
import com.app.kady.shared.ui.DefaultButton
import com.app.kady.ui.theme.BackGroundPrincipal
import com.app.kady.ui.theme.BrownOliver
import com.app.kady.ui.theme.GreenOliver
import com.app.kady.ui.theme.PoppinsTypography

@Composable
fun ProductScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(20.dp),
    ) {
        Box() {
            Icon(
                imageVector = Icons.Filled.ArrowBack,
                contentDescription = "",
                modifier = Modifier.size(25.dp)
            )
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()
        ) {

            Text(
                text = "LECHE",
                color = BrownOliver,
                style = PoppinsTypography.displayMedium,
                fontSize = 30.sp, modifier = Modifier.padding(top = 25.dp, bottom = 15.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.leche),
                contentDescription = "logo",
                modifier = Modifier
                    .width(180.dp)
            )
        }
        DatesOfProduct()
        Spacer(modifier = Modifier.padding(top = 90.dp))
        DefaultButton(
            text = "Añadir al carrito",
            color = GreenOliver,
            enabled = true,
            icon = Icons.Filled.ShoppingCart,
            handleClick = {})
    }
}
@Composable
fun DatesOfProduct() {
    Text(
        text = "Datos:",
        color = BrownOliver,
        style = PoppinsTypography.displayMedium,
        modifier = Modifier.padding(top = 30.dp, bottom = 8.dp)
    )
    Column {
        DatesOfProduct(date = "Cantidad", amount = "250 ml")
        DatesOfProduct(date = "Precio", amount = "S/ 5.00")
        DatesOfProduct(date = "Tienda", amount = "Don Pinos")
        DatesOfProduct(date = "F.Vencimiento", amount = "17/02/2027")
    }
}
@Composable
fun DatesOfProduct(
    date: String,
    amount: String
) {
    OutlinedCard(
        onClick = {},
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = BackGroundPrincipal)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp, bottom = 8.dp, start = 5.dp, end = 12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = date,
                modifier = Modifier.padding(start = 10.dp),
                color = Color(0xFF3B3F1A),
                style = PoppinsTypography.labelMedium,
            )
            Text(
                text = amount,
                modifier = Modifier.padding(),
                color = Color(0xFF3B3F1A),
                style = PoppinsTypography.displaySmall,
            )
        }
    }
}
