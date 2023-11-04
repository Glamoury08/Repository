package com.example.myapplication
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Row{
                MyText()
                MyText()
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(30.dp, 10.dp,)
                )
                {MyText()
                    MyText()
                }
            }}
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
   }

@Composable
fun MyText() {
    Text(
        text = "Love Dream Free\nCoffe Co",
        textAlign = TextAlign.Center,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = 3.sp,
        color = Color.Magenta,
        fontSize = 16.sp,
        modifier = Modifier
            .background(Color.LightGray)
            .padding(20.dp)
    )
}