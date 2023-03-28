package br.senai.sp.jandira.loginactivity

import android.content.Context
import android.icu.text.AlphabeticIndex.Bucket.LabelType
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.loginactivity.components.bottomShape
import br.senai.sp.jandira.loginactivity.components.topShape
import br.senai.sp.jandira.loginactivity.ui.theme.LoginActivityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginActivityTheme {
                Surface {
                    LoginScreen()
                }
                }
            }
        }
    }


@Preview(showSystemUi = true)
@Composable
fun LoginScreen() {

    var emailState = rememberSaveable {
        mutableStateOf("")
    }
    var passwordState = rememberSaveable {
        mutableStateOf("")
    }
    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {

        Column(modifier = Modifier.fillMaxWidth()) {
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End) {
                topShape()
            }
        }


        //HEADER
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 200.dp, start = 25.dp)
        ) {


            Text(
                text = stringResource(id = R.string.title),
                fontSize = 48.sp,
                color = Color(207, 6, 240, 240),
                fontWeight = FontWeight.Bold


            )
            Text(
                text = stringResource(id = R.string.subtitle),
                color = Color(160, 156, 156, 240)

            )
        }
        //FORM
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 350.dp, start = 30.dp)


        ) {
            OutlinedTextField(
                value = "",
                label = { Text(text = stringResource(id = R.string.email))},
                onValueChange = {
                    emailState.value = it
                },
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 17.dp),
                leadingIcon = {
                    Icon(painter = painterResource(id = R.drawable.baseline_email_24),
                        contentDescription = null,
                    tint = Color(207,6,240)
                    )

                }


            )

            Spacer(modifier = Modifier.height(32.dp))



            OutlinedTextField(
                value = "",
                label = { Text(text = stringResource(id = R.string.password)) },
                onValueChange = {
                    passwordState.value = it
                },
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 17.dp),
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_https_24),
                        contentDescription = null,
                        tint = Color(207,6,240)
                    )
                }
            )


        }
        //FOOTER
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 530.dp, start = 168.dp)
        ) {

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(start = 90.dp)
                    .width(120.dp)
                    .height(48.dp),
                colors = ButtonDefaults.buttonColors(Color(207,6,240)),
                shape = RoundedCornerShape(16.dp)


            ) {
                Row() {
                    Text(
                        text = stringResource(id = R.string.sing_in).uppercase(),
                        color = Color.White
                    )
                    Icon(painter = painterResource(id = R.drawable.baseline_arrow_forward_24),
                        contentDescription = "",
                    tint = Color(240,240,240)
                    )
                }

            }
            Row(modifier = Modifier.padding(top = 20.dp)) {
                Text(
                    text = stringResource(id = R.string.dont_account),
                    color = Color(160, 156, 156, 240)
                )
            }
        }
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 740.dp)) {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Start) {
                bottomShape()
            }
        }
    }


}

