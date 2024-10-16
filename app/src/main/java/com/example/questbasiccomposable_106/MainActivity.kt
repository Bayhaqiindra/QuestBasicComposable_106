package com.example.questbasiccomposable_106

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questbasiccomposable_106.ui.theme.QuestBasicComposable_106Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestBasicComposable_106Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Asnawi(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Asnawi(modifier: Modifier = Modifier) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier.fillMaxSize()
    ) {
        Text(
            text = "LOGIN",
            style = TextStyle(
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Serif
            ),
        )

        Text (
            text = "Ini Adalah Halaman Login",
            style = TextStyle(
                fontSize = 16.sp,
                color = Color.Gray,
                fontFamily = FontFamily.Monospace
            ),
        )

        Spacer(modifier = Modifier.height(16.dp))

        Image (
            painter = painterResource(R.drawable.umy),
            contentDescription = "Logo Universitas Muhammadiyah Yogyakarta",
            modifier = Modifier.size(180.dp)
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "NAMA",
            style = TextStyle(
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Serif
            ),
        )

        Text (
            text = "Bayhaqi Indra Maulana",
            style = TextStyle(
                fontSize = 25.sp,
                color = Color(0xFF6200EA),
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Serif
            ),
        )

        Text (
            text = "20220140106",
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Monospace
            ),
        )

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuestBasicComposable_106Theme {
        Asnawi()
    }
}