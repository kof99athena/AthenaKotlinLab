package com.anehta.athenakotlinlab

import java.util.TreeMap

fun main() {
    val binaryReps = TreeMap<Char, String>()

    for (c in 'A'..'F') { //문자의 범위를 사용해 이터레이션한다.
        val binary = Integer.toBinaryString(c.toInt())
        //정수를 2진으로 바꿔준다.
        binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps) {
        println("${letter} = ${binary}")
    }

    println(isLetter('q'))
    println(isNotDigit('x'))

    println(recognize('C'))
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It's digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
    else -> "I don't know!"
}
