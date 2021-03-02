package com.example.androiddevchallenge.ui.screens

import androidx.annotation.DrawableRes
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Puppies
import com.example.androiddevchallenge.models.Puppy
import com.example.androiddevchallenge.ui.components.ImageRes
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun PuppyDetails(puppy: Puppy) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(MaterialTheme.colors.background)
            .verticalScroll(enabled = true, state = rememberScrollState())
    ) {
        ImageRes(
            res = puppy.imageRes,
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
        )
        Row(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = puppy.name,
                style = MaterialTheme.typography.h3,
                color = MaterialTheme.colors.onBackground,
                modifier = Modifier.padding(8.dp).align(Alignment.CenterVertically)
            )
            Spacer(modifier = Modifier.weight(1.0f))
            ExpandableFAB(iconRes = R.drawable.ic_adopt, text = stringResource(id = R.string.adopt), modifier = Modifier.align(Alignment.CenterVertically))
        }
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun ExpandableFAB(
    modifier: Modifier = Modifier,
    @DrawableRes iconRes: Int,
    text: String
) {
    var expanded by remember { mutableStateOf(false) }
    FloatingActionButton(
        onClick = { expanded = !expanded },
        modifier = modifier.padding(16.dp)
    ) {
        Row(Modifier.padding(start = 16.dp, end = 16.dp)) {
            Icon(
                painter = painterResource(id = iconRes),
                contentDescription = null,
                modifier = Modifier.height(20.dp).width(20.dp)
            )
            AnimatedVisibility(
                expanded,
                modifier = Modifier.align(Alignment.CenterVertically)
            ) {
                Text(modifier = Modifier.padding(start = 8.dp), text = text, fontSize = 16.sp)
            }
        }
    }
}

@Preview
@Composable
fun PuppyDetailsPreview() {
    MyTheme {
        PuppyDetails(puppy = Puppies.getPuppy(0))
    }
}

@Preview
@Composable
fun PuppyDetailsDarkThemePreview() {
    MyTheme(darkTheme = true) {
        PuppyDetails(puppy = Puppies.getPuppy(0))
    }
}