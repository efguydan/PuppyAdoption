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
package com.example.androiddevchallenge.ui.utils

object Constants {

    object Routes {
        const val PUPPY_LIST = "puppy_list"
        const val PUPPY_DETAILS_FORMAT = "puppy_details/{${Arguments.PUPPY_INDEX}}"
        const val PUPPY_DETAILS = "puppy_details/"
    }

    object Arguments {
        const val PUPPY_INDEX = "puppyIndex"
    }
}
