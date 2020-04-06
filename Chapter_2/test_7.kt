fun main(args: Array<String>) {
    // 表示一个 [0, 10] 的区间
    val range = 0..10
    // 表示一个 [0, 10) 的区间
    val range2 = 0 until 10
    for (i in range) {
        // println(i)
    }
    for (i in range2) {
        // println(i)
    }
    // 表示在遍历时每次跳2步（类似 python）i = i + 2
    for (i in 0 until 10 step 2) {
        // println(i)
    }
    // 表示逆序
    for (i in 10 downTo 1) {
        println(i)
    }
}