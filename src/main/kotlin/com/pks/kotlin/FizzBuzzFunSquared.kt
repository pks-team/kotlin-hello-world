package com.pks.kotlin

/**
 * @author Martin Varga
 */
fun main(args: Array<String>): Unit {
    (0 until 100).map {
        when {
            it `is divisible by` 3 * 5 -> "FizzBuzz"
            it `is divisible by` 3 -> "Fizz"
            it `is divisible by` 5 -> "Buzz"
            else -> "$it"
        }
    }.forEach(::println)
}

