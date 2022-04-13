package com.example.coroutinebasics.practice2

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * Created by Nishant Kumar on 12-March-2022.
 */

fun main() {
    GlobalScope.launch {
        delay(2000)
        println("world!")
    }

    print("Hello ")
    Thread.sleep(3000)
}