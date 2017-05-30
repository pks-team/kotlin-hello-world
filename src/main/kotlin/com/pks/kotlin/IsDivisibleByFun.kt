package com.pks.kotlin

/**
 * @author Martin Varga
 */
infix fun Int.`is divisible by`(x: Int): Boolean {
    return (this % x) == 0
}