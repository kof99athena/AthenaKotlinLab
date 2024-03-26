package com.anehta.athenakotlinlab

import com.anehta.athenakotlinlab.Colors.*
import java.lang.Exception

fun getWarmth2(colors: Colors) = when (colors) {
    RED, ORAGNE, YELLOW -> "warm"
    GREEN, BLUE -> "neutral"
    INDIGO, VIOLET -> "cold"
}

fun mix(c1: Colors, c2: Colors) =
    when (setOf(c1, c2)) {
        setOf(RED, YELLOW) -> ORAGNE
        setOf(YELLOW, BLUE) -> GREEN
        setOf(BLUE, VIOLET) -> INDIGO
        else -> throw Exception("Dirty color")
    }

fun main() {
    println(mix(RED, YELLOW))
}

fun mixOptimized(c1: Colors, c2: Colors) =
    when {
        (c1 == RED && c2 == YELLOW) || (c1 == YELLOW && c2 == RED) -> ORAGNE
        (c1 == BLUE && c2 == YELLOW) || (c1 == BLUE && c2 == YELLOW) -> GREEN
        (c1 == BLUE && c2 == VIOLET) || (c1 == VIOLET && c2 == BLUE) -> INDIGO
        else -> throw Exception("Dirty color")
    }