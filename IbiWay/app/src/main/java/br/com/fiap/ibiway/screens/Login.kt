package br.com.fiap.ibiway.screens

import android.util.Log
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import br.com.fiap.ibiway.Routes

@Composable
fun Login(navController: NavController) {

    Button(onClick = {
        navController.navigate(Routes.Home.route)
    }) {
        Text(text = "Login")
    }
}