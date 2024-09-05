package br.com.fiap.ibiway.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import br.com.fiap.ibiway.R
import br.com.fiap.ibiway.Routes
import br.com.fiap.ibiway.components.PlaceholderScreen

@Composable
fun MapaScreen(navController: NavController) {
    Box(modifier = Modifier.padding(horizontal = 10.dp, vertical = 10.dp)){
        IconButton(onClick = {
            navController.navigate(Routes.Home.route) {
                popUpTo(navController.graph.findStartDestination().id) {
                    saveState = true
                }
                launchSingleTop = true
                restoreState = true
            }
        }) {
            Icon(painter = painterResource(id = R.drawable.arrow_back_24), contentDescription = "Voltar")
        }
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            PlaceholderScreen(text = "Em construção")
        }
    }
}





