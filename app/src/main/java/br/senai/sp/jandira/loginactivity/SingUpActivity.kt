package br.senai.sp.jandira.loginactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.loginactivity.ui.theme.LoginActivityTheme

class SingUpActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginActivityTheme {
                RegisterScreen()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun RegisterScreen() {
        Surface(
            modifier = Modifier
                .fillMaxSize()
        ) {
           Column(
               modifier = Modifier
                   .fillMaxSize(),
               verticalArrangement = Arrangement.SpaceBetween

           ) {

               Column(modifier = Modifier.fillMaxWidth()) {
                   Row(modifier = Modifier.fillMaxWidth(),
                       horizontalArrangement = Arrangement.End) {
                       Surface(
                           modifier = Modifier
                               .height(40.dp)
                               .width(120.dp),
                           color = Color(207,6,240),
                           shape = RoundedCornerShape(bottomStart = 16.dp)

                       ) {}
                   }
               }

               Column(
                   modifier = Modifier.fillMaxWidth()
               ) {
                    Text(
                        text = stringResource(id = R.string.singup),
                        fontWeight = FontWeight.Bold,
                        fontSize = 32.sp,
                        color = Color(207,6,240)
                    )
                   Text(
                       text = stringResource(id = R.string.create),
                       color = Color(160,156,156)

                   )
               }

               Column(
                   modifier = Modifier.fillMaxWidth(),
               ) {

                    OutlinedTextField(
                        value = "",
                        onValueChange = {
                        },
                        label = { Text(text = stringResource(id = R.string.username))},
                        modifier = Modifier
                            .width(327.dp)
                            .height(58.dp),
                        shape = RoundedCornerShape(16.dp),
                        leadingIcon = {
                            Icon(
                                painter = painterResource(id = R.drawable.baseline_person_24),
                                contentDescription = null,
                                tint = Color(207,6,240)
                            )
                        }

                    )

                   OutlinedTextField(
                       value = "",
                       onValueChange = {
                       },
                       label = { Text(text = stringResource(id = R.string.phone))},
                       modifier = Modifier
                           .width(327.dp)
                           .height(58.dp),
                       shape = RoundedCornerShape(16.dp),
                       leadingIcon = {
                           Icon(
                               painter = painterResource(id = R.drawable.baseline_phone_android_24),
                               contentDescription = null,
                               tint = Color(207,6,240)
                           )
                       }
                   )
                   OutlinedTextField(
                       value = "",
                       onValueChange = {
                       },
                       label = { Text(text = stringResource(id = R.string.email))},
                       modifier = Modifier
                           .width(327.dp)
                           .height(58.dp),
                       shape = RoundedCornerShape(16.dp),
                       leadingIcon = {
                           Icon(
                               painter = painterResource(id = R.drawable.baseline_email_24),
                               contentDescription = null,
                               tint = Color(207,6,240)
                           )
                       }
                   )
                   OutlinedTextField(
                       value = "",
                       onValueChange = {
                       },
                       label = { Text(text = stringResource(id = R.string.password))},
                       modifier = Modifier
                           .width(327.dp)
                           .height(58.dp),
                       shape = RoundedCornerShape(16.dp),
                       leadingIcon = {
                           Icon(
                               painter = painterResource(id = R.drawable.baseline_https_24),
                               contentDescription = null,
                               tint = Color(207,6,240)
                           )
                       }
                   )

                   Row(
                       modifier = Modifier
                           .fillMaxWidth(),
                       verticalAlignment = Alignment.CenterVertically

                   ) {
                       Checkbox(
                           checked = false,
                           onCheckedChange = {}
                       )

                       Text(text = stringResource(id = R.string.over_age)
                       )
                   }

                   Button(
                       onClick = { /*TODO*/ },
                       modifier = Modifier
                           .width(327.dp)
                           .height((48.dp)),
                       shape = RoundedCornerShape(16.dp),
                       colors = ButtonDefaults.buttonColors(Color(207,6,240))
                   ) {
                        Text(
                            text = stringResource(id = R.string.create_account).uppercase(),
                            color = Color(248,248,248),
                            fontWeight = FontWeight.Bold
                        )
                   }

                   Row(
                       modifier = Modifier.fillMaxWidth()
                   ) {
                       Text(
                           text = stringResource(id = R.string.dont_account),
                           color = Color(160,156,156)

                           )
                   }

                   Column(modifier = Modifier
                       .fillMaxWidth()
                       ) {
                       Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Start) {
                           Surface(
                               modifier = Modifier
                                   .height(40.dp)
                                   .width(120.dp),
                               color = Color(207,6,240),
                               shape = RoundedCornerShape(topEnd = 16.dp)

                           ) {

                           }
                       }
                   }
               }
           }
        }
}