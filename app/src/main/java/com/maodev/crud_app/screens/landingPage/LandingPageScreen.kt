package com.maodev.crud_app.screens.landingPage


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LandingPageScreen() {
    Scaffold(
        topBar = { MyTopAppBar() },
        floatingActionButton = { MyFAB() },
        floatingActionButtonPosition = FabPosition.End
    ) {
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
        ) {
            Card(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(vertical = 5.dp, horizontal = 8.dp),
                elevation = CardDefaults.cardElevation(8.dp)
            ) {
            }
        }
    }
}

@Composable
fun MyFAB() {
    FloatingActionButton(
        onClick = { /*TODO navigate to screen to fill item info */ },
        shape = CircleShape,
        containerColor = Color.LightGray,
        elevation = FloatingActionButtonDefaults.elevation(8.dp)
    ) {
        Icon(imageVector = Icons.Filled.Add, contentDescription = "FloatingActionButton")
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopAppBar() {
    TopAppBar(
        title = { Text(text = "CRUD_APP") },
        modifier = Modifier.padding(vertical = 5.dp, horizontal = 5.dp),
        colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.LightGray)
    )
}
