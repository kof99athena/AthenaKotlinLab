package com.anehta.athenakotlinlab

fun main() {
    val set = hashSetOf(1, 2, 3)
    //val list = arrayListOf(1, 2, 3)
    val map = hashMapOf(1 to "one", 7 to "seven", 10 to "ten")
    println(set.javaClass)
    //println(list.javaClass)
    println(map.javaClass)

    val list = listOf(1, 2, 3)
    println(list)
}

