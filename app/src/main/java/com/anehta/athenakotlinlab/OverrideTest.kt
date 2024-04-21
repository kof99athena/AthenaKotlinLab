package com.anehta.athenakotlinlab

import android.content.Context
import android.util.AttributeSet

open class View {
    constructor(ctx: Context) {

    }
    constructor(ctx: Context, attr: AttributeSet) {

    }

    constructor()

    open fun click() = println("View Clicked!")
}

class MyButton : View {
    constructor(ctx: Context) : super(ctx)
    constructor(ctx: Context, attr: AttributeSet) : super(ctx, attr)
}


class Button : View() {
    override fun click() {
        println("Button Clicked!")
    }
}

class Extension {
    //    val String.lastChar: Char
//        get() = get(length - 1)

}

fun main() {
//    Button().click()
//    view.showOff() //I'm View!!
//
//    println()
//    println("Kotlin".lastChar())
//    val sb = StringBuilder("Kotlin")
//    sb.lastChar = '!'
//    println(sb)

    println(subFunction(arrayOf("s","f","d")))
}

fun View.showOff() = print("I'm View!!")
fun Button.showOff() = print("I'm Button!!")

val view: View = Button()

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }

fun subFunction(args: Array<String>) {
    var a = listOf("1")
    val list = listOf("args : ${a}", *args)
    println(list)
}