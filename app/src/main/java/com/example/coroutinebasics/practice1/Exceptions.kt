package com.example.coroutinebasics.practice1

import kotlinx.coroutines.*
import java.util.regex.Matcher
import java.util.regex.Pattern

fun main() {
    /**runBlocking {
        val myHandler = CoroutineExceptionHandler {coroutineContext, throwable ->
            println("Exception handled: ${throwable.localizedMessage}")
        }

        val job = GlobalScope.launch(myHandler) {
            println("Throwing exception from job")
            throw IndexOutOfBoundsException("exception in coroutine")
        }
        job.join()

        val deferred = GlobalScope.async {
            println("Throwing exception from async")
            throw ArithmeticException("exception from async")
        }

        try {
            deferred.await()
        } catch (e: ArithmeticException) {
            println("Caught ArithmeticException: ${e.localizedMessage}")
        }

    }**/
}