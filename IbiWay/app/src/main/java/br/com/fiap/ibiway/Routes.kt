package br.com.fiap.ibiway

sealed class Routes(val route: String) {
    object Home : Routes(route = "home")
    object Login : Routes(route = "login")
    object Mapa : Routes(route = "mapa")
    object Config : Routes(route = "config")
    object Conta : Routes(route = "conta")
}