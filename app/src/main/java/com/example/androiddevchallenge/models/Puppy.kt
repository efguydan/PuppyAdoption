package com.example.androiddevchallenge.models

import androidx.annotation.DrawableRes

data class Puppy(
    val id: Int,
    val name: String,
    val age: String,
    val postedBy: String,
    @DrawableRes val imageRes: Int,
    val description: String
)
