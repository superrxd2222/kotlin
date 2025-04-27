package com.example.marvels.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.marvels.R //

class uiux : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CardAppScreen()
        }
    }
}

@Composable
fun CardAppScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF00C853)) // Green background
            .padding(16.dp)
    ) {
        HeaderSection()
        Spacer(modifier = Modifier.height(24.dp))
        CardGrid()
        Spacer(modifier = Modifier.height(16.dp))
        SettingsSection()
    }
}

@Composable
fun HeaderSection() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(
                text = "Card",
                color = Color.White,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Simple and easy to use app",
                color = Color.White,
                fontSize = 16.sp
            )
        }
        // Add a profile image here if needed
    }
}

@Composable
fun CardGrid() {
    Column {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            CardItem(title = "Text", items = "25 items content", icon = R.drawable.ic_launcher_background
            CardItem(title = "Address", items = "9 items content", icon = R.drawable.ic_address)
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            CardItem(title = "Character", items = "15 items content", icon = R.drawable.ic_address)
            CardItem(title = "Bank card", items = "5 items content", icon = R.drawable.ic_address)
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            CardItem(title = "Password", items = "21 items content", icon = R.drawable.ic_address)
            CardItem(title = "Logistics", items = "10 items content", icon = R.drawable.ic_address)
        }
    }
}

@Composable
fun CardItem(title: String, items: String, icon: Int) {
    Card(
        modifier = Modifier
            .size(width = 160.dp, height = 120.dp)
            .clickable { },
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(id = icon),
                contentDescription = title,
                modifier = Modifier.size(40.dp)
            )
            Column {
                Text(text = title, fontWeight = FontWeight.Bold, fontSize = 16.sp)
                Text(text = items, fontSize = 12.sp, color = Color.Gray)
            }
        }
    }
}

@Composable
fun SettingsSection() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .clickable { },
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_address),
                contentDescription = "Settings",
                modifier = Modifier.size(40.dp),
                tint = Color.Black
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(text = "Settings", fontWeight = FontWeight.Bold, fontSize = 18.sp)
        }
    }
}
