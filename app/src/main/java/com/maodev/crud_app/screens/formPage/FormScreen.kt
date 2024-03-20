package com.maodev.crud_app.screens.formPage

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.maodev.crud_app.components.MyNumberTextField
import com.maodev.crud_app.components.MyTextField

@Preview
@Composable
fun FormScreen() {
    MyScaffold()

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyScaffold() {
    var itemName by remember {
        mutableStateOf("")
    }
    var itemPrice by remember {
        mutableStateOf("")
    }
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
                    .padding(vertical = 5.dp, horizontal = 8.dp)
            ) {
                //TODO formComponents
                Column() {
                    MyTextField(
                        text = itemName,
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth(),
                        label = "Item name",
                        onTextChange = {
                            if (it.all { char ->
                                    char.isLetter() || char.isWhitespace()
                                })
                                itemName = it
                        })
                    MyNumberTextField(
                        text = itemPrice,
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth(),
                        label = "Item price",
                        onTextChange = {
                            if (it.all { char ->
                                    char.isDigit()
                                })
                                itemPrice = it
                        }
                    )
                }
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