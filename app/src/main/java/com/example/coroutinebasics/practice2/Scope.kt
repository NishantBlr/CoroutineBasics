package com.example.coroutinebasics.practice2

import kotlinx.coroutines.*

/**
 * Created by Nishant Kumar on 12-March-2022.
 */

fun main() {
    println("Program execution will now block")
    runBlocking {
        launch {
            delay(1000L)
            println("Task from runBlocking")
        }

        GlobalScope.launch {
            delay(500L)
            println("Task from GlobalScope")
        }

        coroutineScope {
            launch {
                delay(1500L)
                println("Task from coroutineScope")
            }
        }
    }
    runBlocking {
        launch {
            //delay(1000L)
            println("2nd runblocking")
        }
    }
    println("Program execution will now continue")
}