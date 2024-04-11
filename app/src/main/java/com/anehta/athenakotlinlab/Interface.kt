package com.anehta.athenakotlinlab

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

interface Focusable {
    fun setFocus(b: Boolean) {
        println("I ${if (b) "got" else "lost"} focus.")
    }

    fun showOff() = println("I'm focusable!")
}