package com.anehta.athenakotlinlab

open class Person(
    val name: String, // 읽기전용 프로퍼티 : private 필드와 필드를 읽는 단순한 public getter를 만들어낸다.
    var isMarried: Boolean // 쓸 수 있는 프로퍼티 : private 필드와 public  getter/setter를 만들어낸다.
)


