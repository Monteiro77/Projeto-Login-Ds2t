package br.senai.sp.jandira.loginactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.shape.CircleShape

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.loginactivity.components.bottomShape
import br.senai.sp.jandira.loginactivity.components.topShape
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
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    topShape()
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 140.dp)



            ) {
                Text(
                    text = stringResource(id = R.string.singup),
                    fontWeight = FontWeight.Bold,
                    fontSize = 32.sp,
                    color = Color(207, 6, 240),
                )
                Text(
                    text = stringResource(id = R.string.create),
                    color = Color(160, 156, 156),
                    fontSize = 11.sp


                )

                Box(
                    contentAlignment = Alignment
                        .Center,
                    modifier = Modifier.size(150.dp)
                ) {
                    Card(
                        modifier = Modifier
                            .size(100.dp)
                            .align(alignment = Alignment.Center)
                            ,
                        shape = CircleShape,
                        border = BorderStroke(
                            2.dp,
                            Brush.horizontalGradient(
                                colors = listOf(Color.Magenta, Color.White)
                            )

                        )
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_person_outline_24),
                            contentDescription = null,
                            modifier = Modifier
                                .align(alignment = Alignment.Center)
                                .offset(x = 0.dp, y = 0.dp),
                            tint = Color(207, 6, 240)
                        )

                    }

                    Card(
                        modifier = Modifier
                            .size(40.dp)
                            .align(alignment = Alignment.BottomEnd)
                            .offset(x = 5.dp, y = -20.dp),
                        shape = CircleShape,

                    ) {
                       Icon(
                           painter = painterResource(id = R.drawable.camera),
                           contentDescription = null,
                           modifier = Modifier
                               .align(alignment = Alignment.BottomEnd)
                               .offset(x = 0.dp, y = 0.dp)
                               .size(15.dp),
                           tint = Color(207, 6, 240)
                       )
                    }
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 38.dp),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {

                OutlinedTextField(
                    value = "",
                    onValueChange = {
                    },
                    label = { Text(text = stringResource(id = R.string.username)) },
                    modifier = Modifier
                        .width(327.dp)
                        .height(58.dp),
                    shape = RoundedCornerShape(16.dp),
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_person_24),
                            contentDescription = null,
                            tint = Color(207, 6, 240)
                        )
                    }
                )

                OutlinedTextField(
                    value = "",
                    onValueChange = {
                    },
                    label = { Text(text = stringResource(id = R.string.phone)) },
                    modifier = Modifier
                        .width(327.dp)
                        .height(58.dp),
                    shape = RoundedCornerShape(16.dp),
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_phone_android_24),
                            contentDescription = null,
                            tint = Color(207, 6, 240)
                        )
                    }
                )

                OutlinedTextField(
                    value = "",
                    onValueChange = {
                    },
                    label = { Text(text = stringResource(id = R.string.email)) },
                    modifier = Modifier
                        .width(327.dp)
                        .height(58.dp),
                    shape = RoundedCornerShape(16.dp),
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_email_24),
                            contentDescription = null,
                            tint = Color(207, 6, 240)
                        )
                    }
                )

                OutlinedTextField(
                    value = "",
                    onValueChange = {
                    },
                    label = { Text(text = stringResource(id = R.string.password)) },
                    modifier = Modifier
                        .width(327.dp)
                        .height(58.dp),
                    shape = RoundedCornerShape(16.dp),
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_https_24),
                            contentDescription = null,
                            tint = Color(207, 6, 240)
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

                    Text(
                        text = stringResource(id = R.string.over_age)
                    )
                }

                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(327.dp)
                        .height((48.dp)),
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(Color(207, 6, 240))
                ) {
                    Text(
                        text = stringResource(id = R.string.create_account).uppercase(),
                        color = Color(248, 248, 248),
                        fontWeight = FontWeight.Bold
                    )
                }

                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = stringResource(id = R.string.already_have),
                        color = Color(160, 156, 156)
                    )
                }

            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Start) {
                    bottomShape()
                }
            }
        }
    }
}

