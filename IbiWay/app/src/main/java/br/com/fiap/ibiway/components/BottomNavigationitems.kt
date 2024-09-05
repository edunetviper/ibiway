package br.com.fiap.ibiway.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Place
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavigationItems(
    val route: String,
    val title: String? = null,
    val icon: ImageVector? = null
) {
    object Home : BottomNavigationItems(
        route = "home",
        title = "Página Principal",
        icon = Icons.Outlined.Home
    )
    object Mapa : BottomNavigationItems(
        route = "mapa",
        title = "Mapa",
        icon = Icons.Outlined.Place
    )
    object Config : BottomNavigationItems(
        route = "config",
        title = "Configurações",
        icon = Icons.Outlined.Settings
    )
    object Conta : BottomNavigationItems(
        route = "conta",
        title = "Conta",
        icon = Icons.Rounded.AccountCircle
    )

}