package com.example.androiddevchallenge.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun ImageRes(
    modifier: Modifier = Modifier,
    @DrawableRes res: Int,
    contentDescription: String? = null
) {
    CoilImage(
        data = res,
        contentDescription = contentDescription,
        contentScale = ContentScale.Crop,
        fadeIn = true,
        modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .clip(MaterialTheme.shapes.medium)
    )
}
