package com.anehta.athenakotlinlab
//1. 정석 선언
//class ShoppingUser constructor(_nickname: String) {
//    val nickname: String
//
//    init {
//        nickname = _nickname
//    }
//}

//2. constructor 키워드 생략, 프로퍼티 선언에 생성자 프로퍼티를 대입히가
//class ShoppingUser (_nickname: String) {
//    val nickname = _nickname
//}

fun main() {
    val user = ShoppingUser("kim")
    println(user.nickname)
    println(user.isSubScribed)
}

//3. 가장 간결하게
class ShoppingUser constructor(val nickname: String, val isSubScribed: Boolean = true)
//생성자 프로퍼티 이름 앞에 val을 추가하면 프로퍼티 정의와 초기화를 간략히 쓸 수 있다.