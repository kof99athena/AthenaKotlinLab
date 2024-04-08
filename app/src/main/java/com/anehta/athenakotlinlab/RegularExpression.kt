package com.anehta.athenakotlinlab

fun main(){
    println("12.345-.6a".split("\\.|".toRegex()))
    println("12345-6a".split("."))
}