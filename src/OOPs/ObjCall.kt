package OOPs

import java.util.Scanner

open class Parent(private val name: String) {
    protected fun admissionStudent() {
        var num = 0
        for (i in 1..10) {
            if (i%2 == 0) {
                num += i
            }
        }
        println("The sum of even numbers is: $num")
    }

    open fun display() {
        println("The name of the student is: $name")
    }
}
class ObjCall(name: String): Parent(name) {
    private var number = 10
        set(value) {
            if (value in 1..10) {
                field = value
            }
        }

    private fun sum() {
        admissionStudent()
        println("the number value of the number is: $number")
    }
    override fun display() {
        super.display()
        sum()
    }
}

fun main() {
    val sc = Scanner(System.`in`)

    print("Enter the name of the student: ")
    val name = sc.next()

    val obj = ObjCall(name = name)

    obj.display()
}