package com.anehta.athenakotlinlab

import strings.*

fun main() {
    val list = listOf(1, 2, 3)
    println(list.jointoString())
    println(listOf("a","b","c").join(" "))
}

//joinToString 함수를 직접 구현해보자
//fun <T> jointoString(
//    collection: Collection<T>,
//    separator: String = ", ",
//    prefix: String = "",
//    postfix: String =""
//): String {
//    val result = StringBuilder(prefix)
//    for ((index, element) in collection.withIndex()) {
//        //println("result start: ${result}")
//        if (index > 0) result.append(separator) //첫 원소앞에는 구분자를 붙이면 안된다
//        result.append(element)
//        //println("result end: ${result}")
//    }
//    result.append(postfix)
//    return result.toString()
//}