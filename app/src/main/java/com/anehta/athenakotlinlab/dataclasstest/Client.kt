package com.anehta.athenakotlinlab.dataclasstest

fun main() {
    val client1 = Client("고양이", 1111)
    val client2 = Client("고양이", 1111)
    println(client1 == client2) //true

    val processed = hashSetOf(Client("고양이", 1111))
    println(processed.contains(Client("고양이", 1111))) //true

    val lee = Client("강아지", 2222)
    println(lee.copy(postalCode = 4000))
}

class Client(val name: String, val postalCode: Int) {
    override fun hashCode(): Int = name.hashCode() * 31 + postalCode

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client)
        //null이거나 Client 객체가 아니라면?
            return false
        return name == other.name &&
                postalCode == other.postalCode
    }

    override fun toString() = "Client(name=$name, postalCode=$postalCode)"
    //결과값
    //override 시: Client(name=kim, postalCode=1111)
    //override 안하면: com.anehta.athenakotlinlab.dataclasstest.Client@7c30a502

    fun copy(name: String = this.name, postalCode: Int = this.postalCode) = Client(name, postalCode)
}