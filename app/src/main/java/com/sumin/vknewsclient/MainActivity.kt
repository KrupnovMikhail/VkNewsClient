package com.sumin.vknewsclient

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Test()
        }
    }
}

@Composable
private fun Test() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "TopAppBar title")
                },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Filled.Menu, contentDescription = null)
                    }
                }
            )
        },
        bottomBar = {
            BottomNavigation {
                BottomNavigationItem(
                    selected = true,
                    onClick = { },
                    icon = {
                        Icon(Icons.Filled.Favorite, contentDescription = null)
                    },
                    label = {
                        Text(text = "Favourite")
                    }
                )
                BottomNavigationItem(
                    selected = true,
                    onClick = { },
                    icon = {
                        Icon(Icons.Outlined.Edit, contentDescription = null)
                    },
                    label = {
                        Text(text = "Edit")
                    }
                )
                BottomNavigationItem(
                    selected = true,
                    onClick = { },
                    icon = {
                        Icon(Icons.Outlined.Delete, contentDescription = null)
                    },
                    label = {
                        Text(text = "Delete")
                    }
                )
            }
        },
        drawerContent = {
            Text(text = "Text 1")
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Text 2")
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Text 3")
        }
    ) {
        Text(
            modifier = Modifier.padding(it),
            text = "This is scaffold content"
        )
    }
}
