package br.com.fiap.ibiway.screens

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import br.com.fiap.ibiway.R

@Composable
fun MenuPrincipal(navController: NavController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route.toString()
    Log.d("NavBar", "currentRoute: $currentRoute")
    Box(modifier = Modifier.fillMaxSize()){
        Column(modifier = Modifier.fillMaxWidth()) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
                    .clip(shape = RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp))
                    .background(colorResource(id = R.color.roxo))
                    .padding(20.dp)
            ) {
                Column(modifier = Modifier.padding(top = 30.dp)) {
                    Text(text = "Para onde vamos?",
                        modifier = Modifier.fillMaxWidth(),
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        textAlign = TextAlign.Start
                    )
                    Spacer(modifier = Modifier.height(32.dp))
                    TextField(
                        value = "",
                        onValueChange = {
                        },
                        modifier = Modifier.fillMaxWidth(),
                        label = {
                            Text(text = "Informe o destino")
                        },
                        placeholder = {
                            Text(text = "Digite o endereço de onde deseja ir")
                        },
                        shape = RoundedCornerShape(50.dp),
                        leadingIcon = {
                            Icon(
                                painter = painterResource(id = R.drawable.search_24),
                                contentDescription = "ícone de procura")
                        }
                    )
                }

            }
            Column(modifier = Modifier.padding(20.dp)) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .offset(y = (-50.dp)),
                    colors = CardDefaults
                        .cardColors(containerColor = Color.White),
                    elevation = CardDefaults.cardElevation(5.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceAround,
                        modifier = Modifier
                            .padding(horizontal = 32.dp, vertical = 10.dp)
                            .fillMaxWidth())
                    {
                        Column(
                            modifier = Modifier
                                .fillMaxHeight()
                                .weight(1f),
                            horizontalAlignment = Alignment.Start
                        ) {
                            Text(text = "Bilhete",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Gray,
                                textAlign = TextAlign.Center
                            )
                            Spacer(modifier = Modifier.height(18.dp))
                            IconButton(
                                onClick = { /*TODO*/ },
                                modifier = Modifier.size(50.dp)
                                ){
                                Icon(
                                    painter = painterResource(id = R.drawable.rounded_transit_ticket_24),
                                    contentDescription = "imagem de bilhete",
                                    modifier = Modifier.fillMaxSize(),
                                    tint = Color.Gray,
                                )
                            }

                        }
                        Column(
                            modifier = Modifier
                                .weight(2f)
                                .fillMaxHeight(),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(text = "Saldo",
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Gray,
                                textAlign = TextAlign.Center
                            )
                            Spacer(modifier = Modifier.height(25.dp))
                            Text(text = "R$ 395,00",
                                fontSize = 30.sp,
                                fontWeight = FontWeight.Bold,
                                color = colorResource(id = R.color.roxo),
                                textAlign = TextAlign.Center
                            )
                        }
                        Column(
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight(),
                            horizontalAlignment = Alignment.End
                        ) {
                            Text(text = "Recarregar",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Gray,
                                textAlign = TextAlign.Center
                            )
                            Spacer(modifier = Modifier.height(18.dp))
                            IconButton(
                                onClick = { /*TODO*/ },
                                modifier = Modifier
                                    .size(45.dp)
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.add_circle_24),
                                    contentDescription = "imagem de bilhete",
                                    tint = Color.Gray,
                                    modifier = Modifier.fillMaxSize()
                                )
                            }


                        }
                    }
                }
            }
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)) {
                Text(
                    text = "Transporte",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = colorResource(id = R.color.azul_tema),
                    textAlign = TextAlign.Start
                )
                Row(modifier = Modifier.fillMaxWidth()) {
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color.White),
                        modifier = Modifier
                            .weight(1f)
                            .height(160.dp)
                            .padding(10.dp)
                            .shadow(elevation = 5.dp, shape = RoundedCornerShape(10.dp)),
                        shape = RoundedCornerShape(10.dp),

                        ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Icon(
                                painter = painterResource(id = R.drawable.bus_24),
                                contentDescription = "botão de onibus",
                                modifier = Modifier.size(80.dp),
                                tint = Color.Gray
                            )
                            Text(
                                text = "Ônibus",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Gray,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color.White),
                        modifier = Modifier
                            .weight(1f)
                            .height(160.dp)
                            .padding(10.dp)
                            .shadow(elevation = 5.dp, shape = RoundedCornerShape(10.dp)),
                        shape = RoundedCornerShape(10.dp),

                        ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Icon(
                                painter = painterResource(id = R.drawable.train_24),
                                contentDescription = "botão de onibus",
                                modifier = Modifier.size(80.dp),
                                tint = Color.Gray
                            )
                            Text(
                                text = "Trem / Metrô",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Gray,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color.White),
                        modifier = Modifier
                            .weight(1f)
                            .height(160.dp)
                            .padding(10.dp)
                            .shadow(elevation = 5.dp, shape = RoundedCornerShape(10.dp)),
                        shape = RoundedCornerShape(10.dp),

                        ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Icon(
                                painter = painterResource(id = R.drawable.taxi_24),
                                contentDescription = "botão de onibus",
                                modifier = Modifier.size(80.dp),
                                tint = Color.Gray
                            )
                            Text(
                                text = "Carona privada",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Gray,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }
            }
        }
    }
}