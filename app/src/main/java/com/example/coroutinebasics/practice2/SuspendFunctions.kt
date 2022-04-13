package com.example.coroutinebasics.practice2

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * Created by Nishant Kumar on 12-March-2022.
 */

var functionCalls = 0

fun main() {
    GlobalScope.launch { completeMessage() }
    GlobalScope.launch { improveMessage() }
    print("Hello ")
    Thread.sleep(2000L)
    println("There have been $functionCalls calls so far")
}

suspend fun completeMessage() {
    delay(500L)
    println("World!")
    functionCalls++
}

suspend fun improveMessage() {
    delay(1000L)
    println("Functions are cool")
    functionCalls++
}