package com.anehta.athenakotlinlab.test4

//주 생성자안에 프로퍼티를 직접 선언한 간결한 구문을 사용한다.
//별명만 저장
class PrivateUser(override val nickname: String) : User

//이메일도 함께 저장하기
class SubscribingUser(val email: String) : User {
    override val nickname: String //추상 프로퍼티 구현이므로 override가 필요하다.
        get() = email.substringBefore('@') //커스텀 게터. 이 프로퍼티는 뒷받침하는 필드를 저장하는게 아니라 그때마다 별명을 계산해서 토해낸다.
}

//class FacebookUser(val account: Int) : User {
//    override val nickname: getFacebookName(account)
//}

fun main() {
    println(PrivateUser("kim@naver.com").nickname) //kim@naver.com
    println(SubscribingUser("kim@naver.com").nickname) //kim
}