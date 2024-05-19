package com.anehta.athenakotlinlab.dataclasstest

fun main() {
    println(Client("kim",1111).toString())
}

class Client(val name: String, val postalCode: Int) {
    override fun toString() = "Client(name=$name, postalCode=$postalCode)"
    //결과값
    //override 시: Client(name=kim, postalCode=1111)
    //override 안하면: com.anehta.athenakotlinlab.dataclasstest.Client@7c30a502
}