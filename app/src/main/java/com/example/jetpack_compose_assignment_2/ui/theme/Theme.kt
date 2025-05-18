package com.example.jetpack_compose_assignment_2.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

//private val LightColors = lightColorScheme(
//    primary = CardBlue,
//    onPrimary =DarkBlueGray ,
//    surface = CardBlueDarker,
//    onSurface = NavyBlue,
//    background = LightBlue
//)
//
//private val DarkColors = darkColorScheme(
//    primary = NavyBlue,
//    onPrimary = White,
//    surface = NavyBlue,
//    onSurface = LightBlue,
//    background = DarkBlueGray,
//)
private val LightColors = lightColorScheme(
    primary = BrownCard,            // primary UI elements like buttons
    onPrimary = DarkBrown,          // text/icons on primary surfaces
    surface = BrownCardDarker,      // surfaces like cards
    onSurface = DarkBrown,          // text/icons on surface
    background = LightBrown         // overall background
)

private val DarkColors = darkColorScheme(
    primary = DarkBrown,            // dark mode primary elements
    onPrimary = White,              // text/icons on dark primary
    surface = DeeperBrown,          // card backgrounds in dark mode
    onSurface = LightBrown,         // light text/icons on surface
    background = MediumBrown        // overall background in dark
)

@Composable
fun Jetpackcomposeassignment2Theme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColors else LightColors

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}