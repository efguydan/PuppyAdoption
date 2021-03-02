package com.example.androiddevchallenge.ui.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Puppies
import com.example.androiddevchallenge.models.Puppy
import com.example.androiddevchallenge.ui.components.ImageRes
import com.example.androiddevchallenge.ui.components.VerticalGrid
import com.example.androiddevchallenge.ui.theme.AppThemeState
import com.example.androiddevchallenge.ui.utils.getPuppyDetailsRoute

@Composable
fun PuppyList(navController: NavController, appThemeState: MutableState<AppThemeState>) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(id = R.string.adopt_me_exclamation),
                        color = MaterialTheme.colors.contentColorFor(MaterialTheme.colors.background)
                    )},
                elevation = 4.dp,
                backgroundColor = MaterialTheme.colors.background,
                actions = {
                    IconButton(onClick = {
                        appThemeState.value = appThemeState
                            .value.copy(darkTheme = !appThemeState.value.darkTheme)
                    }) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_sleep),
                            contentDescription = null
                        )
                    }
                }
            )
        }
    ) {
        VerticalGrid(modifier = Modifier
            .padding(horizontal = 4.dp)
            .verticalScroll(enabled = true, state = rememberScrollState())) {
            Puppies.get().mapIndexed { index, puppy ->
                SinglePuppyItem(
                    puppy = puppy,
                    modifier = Modifier.padding(horizontal = 4.dp, vertical = 4.dp).clickable {
                        navController.navigate(getPuppyDetailsRoute(index))
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
            .clip(RoundedCornerShape(8.dp))
    ) {
        ImageRes(
            res = puppy.imageRes,
            modifier = Modifier.weight(1.0f)
        )
        Text(
            text = puppy.name,
            style = MaterialTheme.typography.body1
        )
    }
}
