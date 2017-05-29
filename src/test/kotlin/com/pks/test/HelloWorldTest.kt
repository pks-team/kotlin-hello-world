package com.pks.test

import com.pks.kotlin.HelloWorld
import org.junit.Assert
import org.junit.Test

/**
 * @author Tim Lavers, Martin Varga
 */
class HelloWorldTest {

    @Test
    fun aTest() {
        Assert.assertTrue(true)
    }

    @Test
    fun `should create a proper greeting`() {
        Assert.assertEquals("Hello, World!", HelloWorld("Hello").createGreeting("World"))
    }
}