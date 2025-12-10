package com.example.hello_world

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class HelloActivity: ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent{
            hello()
        }
    }
}
@Composable
fun hello(){
    Box(modifier= Modifier.fillMaxSize().background(color = Color(0xFFBBDEFB))){
        Text(text="Hello, World", fontSize = 24.sp, modifier=Modifier.padding(20.dp).padding(start = 90.dp, top = 350.dp), color = Color(0xFF0D47A1))
    }
}