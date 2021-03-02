 /*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.data.Puppies
import com.example.androiddevchallenge.ui.screens.PuppyDetails
import com.example.androiddevchallenge.ui.screens.PuppyList
import com.example.androiddevchallenge.ui.theme.AppThemeState
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.SystemUiController
import com.example.androiddevchallenge.ui.utils.Constants

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val systemUiController = remember { SystemUiController(window) }
            val appTheme = remember { mutableStateOf(AppThemeState()) }
            MyTheme(appTheme.value.darkTheme) {
                MyApp(appTheme, systemUiController)
            }
        }
    }
}

@Composable
fun MyApp(appThemeState: MutableState<AppThemeState>, systemUiController: SystemUiController) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Constants.Routes.PUPPY_LIST) {
        val statusBarBackground = if (appThemeState.value.darkTheme) Color.Black else Color.White
        systemUiController.setStatusBarColor(color = statusBarBackground, darkIcons = !appThemeState.value.darkTheme)
        composable(Constants.Routes.PUPPY_LIST) { PuppyList(navController = navController, appThemeState = appThemeState) }
        composable(Constants.Routes.PUPPY_DETAILS_FORMAT, arguments = listOf(navArgument(Constants.Arguments.PUPPY_INDEX) {type = NavType.IntType})) {
            val puppyIndex = it.arguments?.getInt(Constants.Arguments.PUPPY_INDEX)!!
            PuppyDetails(navController, Puppies.getPuppy(puppyIndex))
        }
    }
}