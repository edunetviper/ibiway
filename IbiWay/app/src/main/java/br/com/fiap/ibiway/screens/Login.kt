package br.com.fiap.ibiway.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import br.com.fiap.ibiway.R
import br.com.fiap.ibiway.Routes
import coil.compose.AsyncImagePainter

@Composable
fun Login(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()){
        Image(
            painter = painterResource(id = R.drawable.loginbkg),
            contentDescription = "imagem backgroud",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "IbiWay",
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(id = R.color.roxo)
            )
            Spacer(modifier = Modifier.height(32.dp))
            Text(
                text = "Seja bem vindo!",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )
            Button(onClick = {
                navController.navigate(Routes.Home.route)
            }) {
                Text(text = "Login")
            }
        }
    }

}
