package com.anehta.athenakotlinlab

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() { // 프로퍼티 게터 선언
            return height == width
        }
}

enum class Color {
    RED, ORAGNE, YELLOW, GREEN, BLUE, INDIGO, VIOLET,
}

enum class Colors(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0), ORAGNE(255, 165, 0), YELLOW(255, 255, 0),
    GREEN(0, 255, 0), BLUE(0, 0, 255), INDIGO(75, 0, 130), VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun main() {
    println(getMnemonic(Colors.RED)) //Richard
}

fun getMnemonic(color: Colors) =
    when (color) {
        Colors.RED -> "Richard"
        Colors.ORAGNE -> "Of"
        Colors.YELLOW -> "York"
        Colors.GREEN -> "Gave"
        Colors.BLUE -> "Battle"
        Colors.INDIGO -> "In"
        Colors.VIOLET -> "Vain"
    }

//한 분기안에서 여러개 사용하기
fun getWarmth(color: Colors) =
    when (color) {
        Colors.RED, Colors.ORAGNE, Colors.YELLOW -> "warm"
        Colors.GREEN, Colors.BLUE, Colors.INDIGO -> "neutral"
        Colors.VIOLET -> "cold"
    }
