package com.anehta.athenakotlinlab.test4

class User3(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println(
                """
                Address was changed for $name:
            "${field}" -> "${value}".""".trimIndent()
            ) //뒷받침하는 필드 값 읽기
            field = value //뒷받침하는 필드값 변경하기
        }
}

fun main() {
    val user: User3 = User3("Lee")
    user.address = "Seoul kangnam"
    //결과값
    //    Address was changed for Lee:
    //"unspecified" -> "Seoul kangnam".
}

interface User {
    val nickname: String
}

interface User2 {
    val email: String
    val nickname: String
        get() = email.substringBefore('@')
}
