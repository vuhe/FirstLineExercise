import kotlin.math.max

fun main(args: Array<String>) {
    val a = 37
    val b = 40
    val value = largerNumber(a, b)
    println("larger number is " + value)
}

fun largerNumber(num1: Int, num2: Int): Int {
    return max(num1, num2)
}

// 可简写为
fun largerNumber2(num1: Int, num2: Int): Int = max(num1, num2)