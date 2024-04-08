package com.anehta.athenakotlinlab

fun main() {
    parsePath("“/Users/yole/kotlin-book/chapter.adoc”")
    println(kotlinLogo.trimMargin("."))
}

val kotlinLogo = """| //
                   .| //
                   .| /\"""

fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")
    println("directory: $directory")
    println("fullName: $fullName")
    println("Dir: $directory, name: $fileName, ext: $extension")
}

fun parsePath2(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if (matchResult != null) {
        val (directory, filename, extension) = matchResult.destructured
        println("Dir: $directory, name: $filename, ext: $extension")
    }
}

