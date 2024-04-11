package com.anehta.athenakotlinlab

fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin"
    //print("Hello ${name}")

    RedButton().showOff()
    RedButton().click()
}

class RedButton : Clickable, Focusable {
    override fun click() = println("I was Clicked!")
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

open class RichButton : Clickable {
    fun disable() {} //이 함수는 파이널이다. 하위클래스가 이 메소드를 오버라이드 할 수 없다.
    open fun animate() {} //이 함수는 열려있다. 하위클래스에서 이 메소드를 오버라이드 할 수 있다.
    override fun click(){} // 이 함수는 (상위클래스에서 선언된) 열려있는 메소드를 오버라이드한다. 오버라이드 한 함수는 기본적으로 열려있다.
}