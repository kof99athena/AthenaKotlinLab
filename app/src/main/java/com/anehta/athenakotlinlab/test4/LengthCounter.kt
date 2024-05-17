package com.anehta.athenakotlinlab.test4

class LengthCounter {
    var counter: Int = 0
        private set //클래스 밖에서 이 프로퍼티의 값을 바꿀수없다.
    fun addword(word: String) {
        counter += word.length
    }
}

fun main(){
    val lengthCounter = LengthCounter()
    lengthCounter.addword("hello world")
    println(lengthCounter.counter)
}