package com.anehta.athenakotlinlab.fizzbuzz

fun main() {
    for (i in 1..10) {
        println(fizzBuzz(i))
    }
    println("--------")
    for (i in 30 downTo 1 step 2) {
        println(fizzBuzz(i))
    }
}

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz"
    i % 3 == 0 -> "Fizz"
    i % 5 == 0 -> "Buzz"
    else -> "${i}" // 셋 다 아니면 그 수 자체를 반환한다.
}


