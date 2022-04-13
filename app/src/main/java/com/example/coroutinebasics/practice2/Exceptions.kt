package com.example.coroutinebasics.practice2

import kotlinx.coroutines.*

/**
 * Created by Nishant Kumar on 12-March-2022.
 */

fun main() {
    runBlocking {
        val myHandler = CoroutineExceptionHandler {coroutineContext, throwable ->
            println("Exception handled: ${throwable.localizedMessage}")
        }
        val job = GlobalScope.launch(Dispatchers.IO + myHandler + CoroutineName("MyGlobalScopeLaunch")) {
            println("Launch name is: ${coroutineContext[CoroutineName.Key]}")
            println("Launch context is: $coroutineContext")
            println("Throwing exception from job")
            throw IndexOutOfBoundsException("Exception in coroutine")
        }
        job.join()

        val deferred = GlobalScope.async(Dispatchers.Default) {
            println("Async context is: $coroutineContext")
            println("Throwing exception from async")
            throw ArithmeticException("exception in async")
        }
        try {
            deferred.await()
        } catch (e: ArithmeticException) {
            println("Caught ArithmeticException ${e.localizedMessage}")
        }
    }
}