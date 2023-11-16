package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {}
}}

@Preview(showBackground = true)
@Composable
    fun Column(){
        Row(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        )
        {
    CustomNumber("1")
        }
    
    }
@Composable
fun   CustomNumber(number: String){
    Text (
        text = number,
        fontWeight= FontWeight.Bold,
        modifier=Modifier
            .background(Color.Cyan)
    )
}









