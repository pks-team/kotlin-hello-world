package com.pks.kotlin

/**
 * @author Martin Varga
 */
class HelloWorld(val greeting: String) {
    fun sayHello(name: String) {
        print("$greeting, $name!")
    }

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            HelloWorld("Hello").sayHello("World")
        }
    }
}