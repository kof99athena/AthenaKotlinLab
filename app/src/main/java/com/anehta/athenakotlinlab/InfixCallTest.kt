package com.anehta.athenakotlinlab

val map = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

infix fun Any.to(other: Any) = Pair(this, other)

//val (number, name) = 1 to "one"
//fun <K, V> mapOf(vararg values: Pair<K, V>): Map<K, V>