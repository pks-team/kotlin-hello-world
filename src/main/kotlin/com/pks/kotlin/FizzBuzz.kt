package com.pks.kotlin

/**
 * @author Martin Varga
 */
fun main(args: Array<String>): Unit {
    for (i in 0..100) {
        println(when {
            i `is divisible by` 15 -> "FizzBuzz"
            i `is divisible by` 3 -> "Fizz"
            i `is divisible by` 5 -> "Buzz"
            else -> "$i"
        })
    }
}

infix fun Int.`is divisible by`(x: Int): Boolean {
    return (this % x) == 0
}
