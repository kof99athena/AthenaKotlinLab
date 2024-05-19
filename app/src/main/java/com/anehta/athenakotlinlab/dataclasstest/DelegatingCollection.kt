package com.anehta.athenakotlinlab.dataclasstest

fun main() {
    val cset = CountingSet<Int>()
    cset.addAll(listOf(1, 1, 2))
    println("${cset.objectsAdded} objects were added, ${cset.size} remain")
}

class CountingSet<T>(
    val innerset: MutableCollection<T> = HashSet<T>()
) : MutableCollection<T> by innerset {
    var objectsAdded = 0

    override fun add(element: T): Boolean {
        objectsAdded++
        return innerset.add(element)
    }

    override fun addAll(c: Collection<T>): Boolean {
        objectsAdded += c.size
        return innerset.addAll(c)
    }
}
