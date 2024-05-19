package com.anehta.athenakotlinlab.objecttest

import com.anehta.athenakotlinlab.Person
import java.io.File

fun main() {
    println(CaseInsensitiveFileComparator.compare(File("/User"), File("/User")))

    val person = listOf(com.anehta.athenakotlinlab.objecttest.Person("kim"),com.anehta.athenakotlinlab.objecttest.Person("lee"))
    println(person.sortedWith(com.anehta.athenakotlinlab.objecttest.Person.NameComparator))
}

data class Person(val name: String) {
    object NameComparator : Comparator<com.anehta.athenakotlinlab.objecttest.Person> {
        override fun compare(
            o1: com.anehta.athenakotlinlab.objecttest.Person,
            o2: com.anehta.athenakotlinlab.objecttest.Person
        ): Int = o1.name.compareTo(o2.name)
    }
}

object CaseInsensitiveFileComparator : Comparator<File> {
    override fun compare(o1: File, o2: File): Int {
        return o1.path.compareTo(o2.path, ignoreCase = true)
    }
}

object Payroll {
    val allEmployees = arrayListOf<Person>()

    fun calculateSalary() {
        //
    }
}

