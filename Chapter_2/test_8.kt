open class Person {
    var name = ""
    var age = 0
    
    fun eat() {
        println(name + " is eating. He is " + age + " years old.")
    }
}

class Student : Person() {
    var sno = ""
    var grade = 0
}

fun main(args: Array<String>) {
    val p = Person()
    p.name = "Jack"
    p.age = 19
    p.eat()
}