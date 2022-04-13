package com.example.coroutinebasics.practice2

import kotlinx.coroutines.*

/**
 * Created by Nishant Kumar on 12-March-2022.
 */

fun main() {
    runBlocking {
//        launch(Dispatchers.Main) {
//            println("Main dispatcher. Thread: ${Thread.currentThread().name}")
//        }

        launch(Dispatchers.Unconfined) {
            println("Unconfined1. Thread: ${Thread.currentThread().name}")
            delay(100L)
            println("Unconfined2. Thread: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.Default) {
            println("Default. Thread: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.IO) {
            println("IO. Thread: ${Thread.currentThread().name}")
        }

        launch(newSingleThreadContext("MyThread")) {
            println("newSingleThreadContext. Thread: ${Thread.currentThread().name}")
        }
    }
}