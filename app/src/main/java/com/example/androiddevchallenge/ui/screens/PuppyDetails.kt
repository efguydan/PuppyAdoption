package com.example.androiddevchallenge.ui.screens

import android.util.Log
import androidx.annotation.DrawableRes
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Puppies
import com.example.androiddevchallenge.models.Puppy
import com.example.androiddevchallenge.ui.components.ExpandableFAB
import com.example.androiddevchallenge.ui.components.ImageRes
import com.example.androiddevchallenge.ui.theme.MyTheme
import kotlin.math.min

@Composable
fun PuppyDetails(navController: NavController?, puppy: Puppy) {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(MaterialTheme.colors.background)
            .verticalScroll(enabled = true, state = scrollState)
    ) {
        Box {
            ImageRes(
                res = puppy.imageRes,
                alignment = BiasAlignment(0f, -1 * scrollState.value / 100f),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp)
            )
            IconButton(onClick = {
                navController?.popBackStack()
            }, modifier = Modifier
                .padding(8.dp)
                .clip(CircleShape)
                .background(Color.Black.copy(alpha = 0.1f))) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_baseline_arrow_back_24),
                    contentDescription = null,
                    tint = MaterialTheme.colors.onBackground
                )
            }
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            Column(
                modifier = Modifier
                    .padding(8.dp)
                    .align(Alignment.CenterVertically)
            ) {
                Text(
                    text = puppy.name,
                    style = MaterialTheme.typography.h3,
                    color = MaterialTheme.colors.onBackground,
                )
                Text(
                    text = puppy.age,
                    style = MaterialTheme.typography.body1,
                    color = MaterialTheme.colors.onBackground,
                )
                Text(
                    text = "Posted by ${puppy.postedBy} on Unsplash",
                    style = MaterialTheme.typography.body2,
                    color = MaterialTheme.colors.onBackground
                )
            }
            Spacer(modifier = Modifier.weight(1.0f))
            ExpandableFAB(iconRes = R.drawable.ic_adopt, text = stringResource(id = R.string.adopt), modifier = Modifier.align(Alignment.CenterVertically))
        }
        Text(
            text = puppy.description,
            style = MaterialTheme.typography.body1,
            color = MaterialTheme.colors.onBackground,
            modifier = Modifier.padding(8.dp)
        )
    }
}

@Preview
@Composable
fun PuppyDetailsPreview() {
    MyTheme {
        PuppyDetails(puppy = Puppies.getPuppy(0), navController = null)
    }
}

@Preview
@Composable
fun PuppyDetailsDarkThemePreview() {
    MyTheme(darkTheme = true) {
        PuppyDetails(puppy = Puppies.getPuppy(0), navController = null)
    }
}