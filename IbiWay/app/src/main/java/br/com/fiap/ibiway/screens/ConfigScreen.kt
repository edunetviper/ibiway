package br.com.fiap.ibiway.screens

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import br.com.fiap.ibiway.Routes
import br.com.fiap.ibiway.components.PlaceholderScreen

@Composable
fun ConfigScreen(navController: NavController) {
    PlaceholderScreen(text = "Em construção")

    Button(onClick = {
        navController.navigate(Routes.Home.route) {
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }
    }) {
        Text(text = "Voltar")
    }
}