package br.com.fiap.ibiway

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.ibiway.screens.ConfigScreen
import br.com.fiap.ibiway.screens.ContaScreen
import br.com.fiap.ibiway.screens.MenuPrincipal
import br.com.fiap.ibiway.screens.Login
import br.com.fiap.ibiway.screens.MapaScreen


@Composable
fun NavigationGraph(navController: NavHostController, showNavBar: (Boolean) -> Unit) {
    NavHost(
        navController = navController,
        startDestination = Routes.Login.route
    ) {
        composable(Routes.Home.route) {
            showNavBar(true)
            MenuPrincipal(navController)
             // Show NavBar for HomeScreen
        }
        composable(Routes.Mapa.route) {
            showNavBar(true)
            MapaScreen(navController)
            // Show NavBar for MapaScreen
        }
        composable(Routes.Config.route) {
            showNavBar(true)
            ConfigScreen(navController)
            // Show NavBar for ConfigScreen
        }
        composable(Routes.Conta.route) {
            showNavBar(true)
            ContaScreen(navController)
            // Show NavBar for ConfigScreen
        }
        composable(Routes.Login.route) {
            Login(navController)
            showNavBar(false) // Hide NavBar for LoginScreen
        }
    }
}