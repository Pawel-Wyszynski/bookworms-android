package com.zmp.bookworms

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.zmp.bookworms.components.CButton
import com.zmp.bookworms.ui.theme.background
import com.zmp.bookworms.ui.theme.claret
import com.zmp.bookworms.ui.theme.nunitoSansFontFamily

@Composable
fun WelcomeScreen(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {

    Surface(
        color = background
    ) {

        Box(
            modifier = modifier.fillMaxSize()
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(color = claret)
            ) {}

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 24.dp)
            ) {

                Image(
                    painter = painterResource(id = R.drawable.bookworms_logo),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(top = 84.dp, bottom = 30.dp)
                        .height(100.dp),
                    contentScale = ContentScale.Fit
                )

                Text(
                    "Bookworms",
                    fontSize = 32.sp,
                    fontFamily = nunitoSansFontFamily,
                    fontWeight = FontWeight(700),
                    color = Color.Black
                )

                Spacer(modifier = Modifier.weight(1f))

                Text(
                    "Jeżeli szukasz miejsca, w którym możesz porządkować swoją" +
                            " biblioteczkę to Bookworms jest dla Ciebie!\n\nMożesz" +
                            " dodawać książki jako: przeczytane, do przeczytania" +
                            " oraz aktualnie czytane. Wszystko w jednym miejscu.\n\n" +
                            "Nie masz jeszcze konta? Zachęcamy do rejestracji!",
                    textAlign = TextAlign.Justify,
                    fontSize = 18.sp,
                    fontFamily = nunitoSansFontFamily,
                    fontWeight = FontWeight(500),
                    color = Color.Black
                )

                Spacer(modifier = Modifier.weight(1f))

                Row(
                    modifier = Modifier
                        .align(Alignment.End)
                ) {
                    Text(
                        "Zespół Bookworms",
                        fontSize = 18.sp,
                        fontFamily = nunitoSansFontFamily,
                        fontWeight = FontWeight(500),
                        color = Color.Black
                    )
                }

                Spacer(modifier = Modifier.weight(3f))

                CButton(text = "Zaloguj się",
                    onClick = {
                        navController.navigate("login")
                    }
                )

                Row(
                    modifier = Modifier.padding(top = 12.dp, bottom = 52.dp)
                ) {
                    Text(
                        "Nie masz konta? ",
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontFamily = nunitoSansFontFamily,
                            color = Color.Black
                        )
                    )

                    Text(
                        "Zarejestruj się",
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontFamily = nunitoSansFontFamily,
                            fontWeight = FontWeight(800),
                            color = Color.Black
                        ),
                        modifier = Modifier.clickable {
                            navController.navigate("register")
                        }
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 400, heightDp = 800)
@Composable
fun WelcomeScreenPreview() {
    WelcomeScreen(rememberNavController())
}