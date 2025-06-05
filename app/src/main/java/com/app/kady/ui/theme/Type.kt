package com.app.kady.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import com.app.kady.R


val Poppins = FontFamily(
    Font(R.font.poppins_light, FontWeight.W300),
    Font(R.font.poppins_regular, FontWeight.W400),
    Font(R.font.poppins_medium, FontWeight.Medium),
    Font(R.font.poppins_semi_bold, FontWeight.SemiBold)
)
// Set of Material typography styles to start with
val PoppinsTypography = Typography(
    bodyLarge = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.Medium,
        fontSize = 18.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp,
        color = Color.White
    ),

    bodyMedium = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        //  letterSpacing = 0.5.sp,
    ),
    displayMedium = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp,
        letterSpacing = 0.sp
    ),
    displaySmall = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        letterSpacing = 0.sp
    ),
    labelMedium = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
//        lineHeight = 23.68.sp,
        letterSpacing = 0.sp,

        ),
    labelSmall = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.Light,
        fontSize = 12.sp,
        color = GreySoft
    ),
    headlineMedium = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp
    ),
    bodySmall = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        lineHeight = 23.sp,
        letterSpacing = 0.sp,
        color = Color.Black
    ),
    headlineLarge = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.sp,
        color = Color.Black
    ),
    titleMedium = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.sp,
        color = Color.White
    ),
    labelLarge = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.Medium,
        fontSize = 10.sp,
        lineHeight = 15.sp,
        letterSpacing = 0.sp
    ),
    displayLarge = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        color = Color.White
    ),
    headlineSmall = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.Medium,
        fontSize = 18.sp,
        //  lineHeight = 0.sp,
        // letterSpacing = 0.sp,
        color = Color.Black),

    titleSmall = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.Light,
        fontSize = 14.sp,
        lineHeight = 19.sp,
        color = Color.Black)

/* Other default text styles to override
labelSmall = TextStyle(
fontFamily = FontFamily.Default,
fontWeight = FontWeight.Medium,
fontSize = 11.sp,
lineHeight = 16.sp,
letterSpacing = 0.5.sp
)
*/
)