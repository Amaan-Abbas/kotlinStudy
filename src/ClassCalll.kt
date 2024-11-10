class ClassCalll {
    val num1 = 10
    val num2 = 20

    fun sum(number1: Int, number2: Int) : String {
        return "The sum of the numbers $number1 and $number2 is: ${number1 + number2}"
    }
}

fun main() {
    val obj = ClassCalll()

    print(obj.sum(obj.num1, obj.num2))
}