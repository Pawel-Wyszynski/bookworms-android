package com.zmp.bookworms

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.zmp.bookworms.components.CButton
import com.zmp.bookworms.components.CTextField
import com.zmp.bookworms.ui.theme.form
import com.zmp.bookworms.ui.theme.nunitoSansFontFamily

@Composable
fun LoginScreen(
    navController: NavHostController
) {

    Surface(
        color = form,
        modifier = Modifier.fillMaxSize()
    ) {

        Box(modifier = Modifier.fillMaxSize()) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 24.dp)
            ) {

                Image(
                    painter = painterResource(id = R.drawable.bookworms_logo),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(top = 84.dp, bottom = 30.dp)
                        .height(100.dp)
                        .align(Alignment.CenterHorizontally)
                )

                Text(
                    text = "Zaloguj się",
                    style = TextStyle(
                        fontSize = 28.sp,
                        fontFamily = nunitoSansFontFamily,
                        fontWeight = FontWeight(500),
                        color = Color.White
                    ),
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(bottom = 30.dp)
                )

                CTextField(hint = "Email:", value = "")

                CTextField(hint = "Hasło:", value = "")

                Row(
                    modifier = Modifier
                        .align(Alignment.End)
                        .padding(bottom = 30.dp)
                ) {

                    Text(
                        "Zapomniałeś hasła?",
                        fontSize = 18.sp,
                        fontFamily = nunitoSansFontFamily,
                        fontWeight = FontWeight(800),
                        color = Color.White
                    )
                }

                CButton(text = "Zaloguj")

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
fun LoginScreenPreview() {
    LoginScreen(rememberNavController())
}