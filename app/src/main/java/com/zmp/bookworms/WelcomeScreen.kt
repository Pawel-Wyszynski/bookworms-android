package com.zmp.bookworms

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
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
import com.zmp.bookworms.ui.theme.claret
import com.zmp.bookworms.ui.theme.nunitoSansFontFamily

@Composable
fun WelcomeScreen(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.login_with_books),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize()
        )

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
                    .width(320.dp)
                    .height(240.dp),
                contentScale = ContentScale.Fit
            )

            Text(
                "Bookworms",
                fontSize = 32.sp,
                fontFamily = nunitoSansFontFamily,
                fontWeight = FontWeight(700),
                color = Color.White
            )

            Spacer(modifier = Modifier.weight(1f))

            Text(
                "Jeżeli szukasz miejsca, w którym możesz porządkować swoją biblioteczkę to Bookworms jest dla Ciebie!\n\nMożesz dodawać książki jako: przeczytane, do przeczytania oraz aktualnie czytane. Wszystko w jednym miejscu.\n\nNie masz jeszcze konta? Zachęcamy do rejestracji!\n\nZespół Bookworms",
                textAlign = TextAlign.Center,
                fontSize = 18.sp,
                fontFamily = nunitoSansFontFamily,
                fontWeight = FontWeight(500),
                color = Color.White
            )

            Spacer(modifier = Modifier.weight(3f))

            Button(
                onClick = { /*TODO*/ },
                shape = MaterialTheme.shapes.large,
                colors = ButtonDefaults.buttonColors(
                    containerColor = claret
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp)
            ) {

                Text(
                    text = "Zaloguj się",
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontFamily = nunitoSansFontFamily,
                        fontWeight = FontWeight(500),
                        color = Color.White
                    )
                )
            }

            Row(
                modifier = Modifier.padding(top = 12.dp, bottom = 52.dp)
            ) {
                Text(
                    "Nie masz konta? ",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontFamily = nunitoSansFontFamily,
                        color = Color.White
                    )
                )

                Text(
                    "Zarejestruj się",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontFamily = nunitoSansFontFamily,
                        fontWeight = FontWeight(800),
                        color = Color.White
                    )
                )
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 400, heightDp = 800)
@Composable
fun WelcomeScreenPreview() {
    WelcomeScreen()
}