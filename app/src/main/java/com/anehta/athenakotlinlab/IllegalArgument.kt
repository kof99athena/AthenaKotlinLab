package com.anehta.athenakotlinlab

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

fun main() {
    val reader = BufferedReader(StringReader("333333"))
    readNumber(reader) //333333

    val reader2 = BufferedReader(StringReader("hello"))
    readNumber(reader2) //null
    println()
}

fun readNumber(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        null
    }
    println(number)
}

//fun readNumber(reader: BufferedReader): Int? {
//    try {
//        val line = reader.readLine()
//        return Integer.parseInt(line)
//    } catch (e: NumberFormatException) {
//        return null
//    } finally {
//        reader.close()
//    }
//}


