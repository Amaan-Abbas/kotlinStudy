import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    print("Enter any number: ")
    val number: Int = sc.nextInt()

    println("Number from 1 to $number is: ")
    for(i in 1..number) {
        println(i)
    }
}