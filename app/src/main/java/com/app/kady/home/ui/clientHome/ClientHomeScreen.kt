package com.app.kady.home.ui.clientHome

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BakeryDining
import androidx.compose.material.icons.filled.DinnerDining
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.PanoramaPhotosphere
import androidx.compose.material.icons.filled.PersonOutline
import androidx.compose.material.icons.filled.Restaurant
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.SetMeal
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Store
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.app.kady.ui.theme.BackGroundPrincipal
import com.app.kady.ui.theme.BrownOliver
import com.app.kady.ui.theme.GreenOliver
import com.app.kady.ui.theme.PoppinsTypography

@Composable
fun ClientHomeScreen(
) {
    Scaffold(
        topBar = { ToolBar() },
        bottomBar = { AppBar() }
    ) {
        Column(modifier = Modifier.padding(it)) {
            Spacer(modifier = Modifier.height(20.dp))
            Categories()
            ProductsCard()
        }
    }
}

@kotlin.OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ToolBar() {
    TopAppBar(
        title = {
            Text(
                text = "KADY", color = BackGroundPrincipal, style = PoppinsTypography.displayMedium
            )
        },
        colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFF777d3b)),
        modifier = Modifier
            .padding(9.dp)
            .clip(RoundedCornerShape(14.dp)),
        actions = {

            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Filled.PersonOutline, contentDescription = "",
                    modifier = Modifier
                        .background(
                            color = BackGroundPrincipal,
                            shape = RoundedCornerShape(20.dp)
                        )
                        .padding(5.dp)
                )
            }
        }
    )
}
@Composable
fun Categories() {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
        IconButton(icon = Icons.Filled.Restaurant, color = GreenOliver, Modifier = Modifier)
        Spacer(modifier = Modifier.width(16.dp))
        IconButton(icon = Icons.Filled.Store, color = GreenOliver, Modifier = Modifier)
        Spacer(modifier = Modifier.width(16.dp))
        IconButton(icon = Icons.Filled.BakeryDining, color = GreenOliver, Modifier = Modifier)
    }
}
@Composable
fun IconButton(
    icon: ImageVector,
    color: Color,
    Modifier: Modifier
) {
    IconButton(
        onClick = {},
        modifier = Modifier
            .size(53.dp)
            .background(color = color, shape = RoundedCornerShape(30.dp))
    ) {
        Icon(
            imageVector = icon,
            contentDescription = "",
            modifier = Modifier.size(29.dp), tint = BackGroundPrincipal
        )
    }
}
@Composable
fun ProductsCard() {
    Column(modifier = Modifier.padding(top = 25.dp, start = 14.dp, end = 14.dp)) {
        Text(
            text = "Productos", color = BrownOliver, style = PoppinsTypography.displayMedium,
        )
        Spacer(modifier = Modifier.height(10.dp))
        Products(Icons.Filled.DinnerDining, productName = "Atún", price = "S/ 5.00")
        Spacer(modifier = Modifier.height(10.dp))
        Products(Icons.Filled.SetMeal, productName = "Manzana", price = "S/ 3.00")
        Spacer(modifier = Modifier.height(10.dp))
        Products(Icons.Filled.PanoramaPhotosphere, productName = "Pan", price = "S/ 2.00")
        Spacer(modifier = Modifier.height(10.dp))
        Products(Icons.Filled.DinnerDining, productName = "Atún", price = "S/ 5.00")
        Spacer(modifier = Modifier.height(10.dp))
        Products(Icons.Filled.SetMeal, productName = "Manzana", price = "S/ 3.00")
        Spacer(modifier = Modifier.height(10.dp))
        Products(Icons.Filled.PanoramaPhotosphere, productName = "Pan", price = "S/ 2.00")
    }
}
@Composable
fun Products(
    icons: ImageVector,
    productName: String,
    price: String
) {
    OutlinedCard(
        onClick = {},
        modifier = Modifier.fillMaxWidth(),
        border = BorderStroke(1.dp, color = GreenOliver),
        colors = CardDefaults.cardColors(containerColor = BackGroundPrincipal)
    ) {
        Row(modifier = Modifier.padding(13.dp), verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = icons, contentDescription = "", modifier = Modifier.size(30.dp)
            )
            Text(
                text = productName,
                modifier = Modifier.padding(start = 10.dp),
                color = Color(0xFF3B3F1A),
                style = PoppinsTypography.labelMedium,
            )
            Box(contentAlignment = Alignment.BottomEnd, modifier = Modifier.fillMaxWidth()) {

                Text(
                    text = price,
                    modifier = Modifier.padding(),
                    color = Color(0xFF3B3F1A),
                    style = PoppinsTypography.displaySmall,
                )
            }
        }
    }
}
@Composable
fun AppBar() {
    BottomAppBar(
        containerColor = GreenOliver,
        actions = {
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth()
            ) {
                IconButton(
                    icon = Icons.Filled.Home,
                    color = GreenOliver,
                    Modifier = Modifier.size(32.dp)
                )
                IconButton(
                    icon = Icons.Filled.Search,
                    color = GreenOliver,
                    Modifier = Modifier.size(32.dp)
                )
                IconButton(
                    icon = Icons.Filled.ShoppingCart,
                    color = GreenOliver,
                    Modifier = Modifier.size(32.dp)
                )
            }
        }
    )
}