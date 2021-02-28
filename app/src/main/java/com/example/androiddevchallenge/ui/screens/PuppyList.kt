package com.example.androiddevchallenge.ui.screens

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.components.PuppyAppBar

@Composable
fun PuppyList(navController: NavController) {
    Scaffold(
        topBar = { PuppyAppBar(title = stringResource(id = R.string.adopt_me_exclamation)) }
    ) {
        Surface(color = MaterialTheme.colors.background) {
            
        }
    }
}