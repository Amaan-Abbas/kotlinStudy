import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val check = sc.nextInt()

    print("Enter any number: ")
    val number: Int = sc.nextInt()

    println("Number from 1 to $number is: ")
    for (i in 1..<number) {
        println(i)
    }

    //using when statement to for checking the conditions.
    when (check) {
        1 -> println("The $check is greater than $number")
        2 -> println("The $check is less than $number")
        else -> println("The number input is invalid")
    }

    //When expression
    val string: String = when (check) {
        1 -> "The $check is greater than $number"
        2 -> "The $check is less than $number"
        else -> "The number input is invalid"
    }

    println(string)

    //if expression.
    val printing : String = if (check > number) "The number is greater" else "The number is smaller."
    print("\n $printing")
}