package com.example.coroutinebasics.practice1

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.random.Random

fun main() {
    runBlocking {
        val firstDeferred = async { getFirstValue() }
        val secondDeferred = async { getSecondValue() }

        println("Doing some processing here")
        //delay(500L)
        println("Waiting for values")

        val firstValue = firstDeferred.await()
        println("Got first value, waiting for second value")
        val secondValue = secondDeferred.await()
        println("Received all values")
        println("The total is ${firstValue + secondValue}")

    }
}

suspend fun getFirstValue(): Int {
    delay(5000L)
    val value = Random.nextInt(100)
    println("Returning first value: $value")
    return value
}

suspend fun getSecondValue(): Int {
    delay(10000L)
    val value = Random.nextInt(1000)
    println("Returning second value: $value")
    return value
}