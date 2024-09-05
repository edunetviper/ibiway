package br.com.fiap.ibiway

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import br.com.fiap.ibiway.components.NavBar
import br.com.fiap.ibiway.ui.theme.IbiWayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IbiWayTheme {
                val navController: NavHostController = rememberNavController()
                var buttonsVisible by remember {
                    mutableStateOf(true)
                }
                Scaffold(bottomBar = {
                    if(buttonsVisible){
                        NavBar(
                            navController = navController,
                            state = buttonsVisible,
                            modifier = Modifier
                        )

                    }
                }) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)){
                        NavigationGraph(navController) { isVisible ->
                            buttonsVisible = isVisible
                        }
                    }
                }
//                val navController: NavHostController = rememberNavController()
//                Scaffold(bottomBar = {
//                    // Let NavigationGraph decide if NavBar should be shown
//                    NavigationGraph(navController) { showNavBar ->
//                        if (showNavBar) {
//                            NavBar(navController = navController, modifier = Modifier)
//                        }
//                    }
//                }) { innerPadding ->
//                    Box(modifier = Modifier.padding(innerPadding)) {
//                        // ... other content
//                    }
//                }

            }
        }
    }
}
