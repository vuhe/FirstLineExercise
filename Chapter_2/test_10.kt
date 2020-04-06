fun main(args: Array<String>) {
    // lambda
    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape", "Watermalon")
    val newList = list.filter { it.length > 7}
                      .map { it.toUpperCase() }
    for (fruit in newList) {
        println(fruit)
    }
    
    // 判空
    var content: String? = "hello"
    content?.toUpperCase()
    content = null
    val textLength = content?.length ?: 0
    println(textLength)
    
    // 字符串插入
    val per = "red"
    println("The color is $per")
}