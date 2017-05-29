package com.pks.kotlin

/**
 * @author Martin Varga
 */
class HelloWorld(val greeting: String) {
    fun createGreeting(name: String): String {
        return "$greeting, $name!"
    }

    fun sayHello(name: String) {
        print(createGreeting(name))
    }

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            HelloWorld("Hello").sayHello("World")
        }
    }
}