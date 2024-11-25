fun printHello() {
    println("Hello")
    val a = 5
    val b = 6
    val result = a * b
    print(result)
}

val valueFun = ::printHello //This command can be used to store the reference of the function printHello(), and can be called in place of printHello() as a function, valueFun90

fun main() {
    valueFun() //Cannot call the reference variable directly like "valueFun", you have to call it along with parenthesis "valueFun()"
}