fun main(args: Array<String>) {
    println("getScore: Tom " + getScore("Tom"))
    println("********************************")
    println("getScore: Tom " + getScore2("Tom"))
    println("getScore: Tomin " + getScore2("Tomin"))
    println("********************************")
    println("checkNumber: ")
    println("Int: ")
    checkNumber(10)
    println("Long: ")
    checkNumber(10L)
    println("********************************")
}

// 类似于 Java 中的 switch
fun getScore(name: String) = when (name) {
    "Tom" -> 86
    "Jim" -> 77
    "Jack" -> 95
    "Lily" -> 100
    else -> 0
}

fun getScore2(name: String) = when {
    name.startsWith("Tom") -> 86
    name == "Jim" -> 77
    name == "Jack" -> 95
    name == "Lily" -> 100
    else -> 0
}

fun checkNumber(num: Number) {
    when (num) {
        is Int -> println("number is Int")
        is Double -> println("number is Double")
        else -> println("number not support")
    }
}