package com.example.coroutinebasics.practice1

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        repeat(100_000) {
            launch {
                print(".")
            }
        }
    }
    print("Hello World!")
}