fun main(args: Array<String>) {
    val a = 37
    val b = 40
    println("larger number is " + largerNumber(a, b))
    println("larger number is " + largerNumber2(a, b))
    println("larger number is " + largerNumber3(a, b))
    println("larger number is " + largerNumber4(a, b))
}

fun largerNumber(num1: Int, num2: Int): Int {
    var value = 0
    if (num1 > num2) {
        value = num1
    } else {
        value = num2
    }
    return value
}

fun largerNumber2(num1: Int, num2: Int): Int {
    val value = if (num1 > num2) {
        num1
    } else {
        num2
    }
    return value
}

fun largerNumber3(num1: Int, num2: Int) = if (num1 > num2) {
    num1
} else {
    num2
}

fun largerNumber4(num1: Int, num2: Int) = if (num1 > num2) num1 else num2