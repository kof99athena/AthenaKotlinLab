package com.anehta.athenakotlinlab

fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin"
    //print("Hello ${name}")

    Button().click()
}

class RedButton : Clickable {
    override fun click() = println("I was Clicked!")
}