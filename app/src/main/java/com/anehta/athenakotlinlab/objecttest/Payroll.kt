package com.anehta.athenakotlinlab.objecttest

import com.anehta.athenakotlinlab.Person
import java.io.File

fun main() {
    println(CaseInsensitiveFileComparator.compare(File("/User"),File("/User")))
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

