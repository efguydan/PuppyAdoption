package com.example.androiddevchallenge.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Puppies
import com.example.androiddevchallenge.models.Puppy
import com.example.androiddevchallenge.ui.components.ImageRes
import com.example.androiddevchallenge.ui.components.PuppyAppBar
import com.example.androiddevchallenge.ui.components.VerticalGrid

@Composable
fun PuppyList(navController: NavController) {
    Scaffold(
        topBar = { PuppyAppBar(title = stringResource(id = R.string.adopt_me_exclamation)) }
    ) {
        VerticalGrid(modifier = Modifier
            .padding(horizontal = 4.dp)
            .verticalScroll(enabled = true, state = rememberScrollState())) {
            for (puppy in Puppies.get()) {
                SinglePuppyItem(
                    puppy = puppy,
                    modifier = Modifier.padding(horizontal = 4.dp, vertical = 4.dp).clickable {
                        /** TODO Handle clicks later */
                    }
                )
            }
        }
    }
}

@Composable
fun SinglePuppyItem(
    modifier: Modifier = Modifier,
    puppy: Puppy
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .height(250.dp)
    ) {
        ImageRes(
            res = puppy.imageRes
        )
        Text(
            text = puppy.name,
            modifier = Modifier.padding(start = 4.dp, top = 4.dp)
        )
    }
}
