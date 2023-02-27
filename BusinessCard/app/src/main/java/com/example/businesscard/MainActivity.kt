package com.example.businesscard


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeBusinessPreview()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp(){
    BusinessCard(fullname = "Siebe Van Nechel",
        title = "Android Developer Extraordinaire",
        number = "+324 71 27 44 00",
        company = "@Odisee",
        email = "siebe.vannechel@student.odisee.be")

}
@Composable
private fun BusinessCard(fullname: String, title: String, number: String, company: String, email: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = androidx.compose.ui.graphics.Color.DarkGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        val image = painterResource(R.drawable.android_logo)
        Image(painter = image, contentDescription = "android", modifier = Modifier.height(70.dp))
        Text(text = fullname, fontSize = 35.sp)
        Text(text = title, fontWeight= FontWeight.Bold, color = Color(0xFF3ddc84))
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 520.dp)
            .background(color = androidx.compose.ui.graphics.Color.DarkGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp)) {
            val iconPhone = painterResource(R.drawable.phone_call)
            Icon(painter = iconPhone, contentDescription= null, modifier = Modifier.height(20.dp) .padding(start = 45.dp, top = 3.dp))
            Text(text = number, modifier = Modifier.padding(start = 20.dp))
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp)) {
            val iconShare = painterResource(R.drawable.share)
            Icon(painter = iconShare, contentDescription= null, modifier = Modifier.height(20.dp) .padding(start = 45.dp, top = 3.dp))
            Text(text = company , modifier = Modifier.padding(start = 20.dp))
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp)) {
            val iconMail = painterResource(R.drawable.mail)
            Icon(painter = iconMail, contentDescription= null, modifier = Modifier.height(20.dp) .padding(start = 45.dp, top = 3.dp))
            Text(text = email , modifier = Modifier.padding(start = 20.dp))
        }

    }
}

@Preview(showBackground = true)
@Composable
fun ComposeBusinessPreview() {
    BusinessCardTheme {
        androidx.compose.material.Surface() {
            BusinessCardApp()
        }
    }
}