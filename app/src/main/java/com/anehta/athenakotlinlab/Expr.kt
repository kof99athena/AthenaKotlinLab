package com.anehta.athenakotlinlab

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

sealed class Expr2 {
    class Num(val value: Int) : Expr2()
    //class Num2(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr2()
}

fun eval2(e: Expr2): Int =
    when (e) {
        is Expr2.Num -> e.value
        is Expr2.Sum -> eval(e.left) + eval(e.right)
    }

fun eval(e: Expr): Int =
    when (e) {

        is Num -> e.value
        is Sum -> eval(e.left) + eval(e.right)
        else ->
            throw IllegalArgumentException("Unknown Expression")


        //    if (e is Num) {
//        val n = e as Num
//        return n.value
//    }
//    if (e is Sum) {
//        return eval(e.right) + eval(e.left)
//    }
//    throw IllegalArgumentException("Unknown Expression")
    }


fun main() {
    println(evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4))))
}

fun evalWithLogging(e: Expr): Int =
    when (e) {
        is Num -> {
            println("num : ${e.value}")
            e.value
        }

        is Sum -> {
            val left = evalWithLogging(e.left)
            val right = evalWithLogging(e.right)
            println("sum : ${left + right}")
            left + right

        }

        else -> throw IllegalStateException("Unknown Expression")
    }