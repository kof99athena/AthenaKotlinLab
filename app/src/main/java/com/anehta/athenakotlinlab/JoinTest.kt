package strings

fun <T> Collection<T>.jointoString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        //println("result start: ${result}")
        if (index > 0) result.append(separator) //첫 원소앞에는 구분자를 붙이면 안된다
        result.append(element)
        //println("result end: ${result}")
    }
    result.append(postfix)
    return result.toString()
}

fun String.lastChar(): Char = this.get(this.length - 1)


fun Collection<String>.join(
    separator: String = " ",
    prefix: String = "",
    postfix: String = ""
) = jointoString(separator, prefix, postfix)