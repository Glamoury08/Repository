package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


        }
    }
}

@Composable
@Preview(showBackground = true)
fun Preview() {
    Text(
         text  = " Hello Jetpack Compose",
    modifier = Modifier
        .padding(top = 30.dp,)
        .fillMaxWidth(),
        textAlign = TextAlign.End,
        style = TextStyle(
            color = Color.Black,
            fontSize = 20.sp
        )
    )
}
