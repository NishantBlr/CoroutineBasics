package com.example.coroutinebasics.practice2

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * Created by Nishant Kumar on 12-March-2022.
 */

fun main() {
    runBlocking {
        launch(CoroutineName("myCoroutine")) {
            println("This is run from ${this.coroutineContext[CoroutineName.Key]}")
        }
    }
}