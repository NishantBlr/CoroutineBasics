package com.example.coroutinebasics.practice2

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * Created by Nishant Kumar on 12-March-2022.
 */

fun main() {
    runBlocking {
        repeat(1_000_000) {
            launch {
                print(",")
            }
        }
    }
}