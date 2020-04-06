interface Study {
    fun readBook()
    fun doHomework()
}

open class Person(var name: String, var age: Int) {    
    fun eat() {
        println(name + " is eating. He is " + age + " years old.")
    }
}

class Student(name: String, age: Int) : Person(name, age), Study {
    override fun readBook() {
        println(name + " is reading.")
    }
    
    override fun doHomework() {
        println(name + " is doing homework.")
    }
}

fun main(args: Array<String>) {
    val student = Student("Jack", 19)
    doStudy(student)
}

fun doStudy(study: Study) {
    study.readBook()
    study.doHomework()
}