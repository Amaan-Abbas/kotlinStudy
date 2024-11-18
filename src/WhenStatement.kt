import java.util.Scanner

fun main() {

    val sc = Scanner(System.`in`)
    print("Enter the name of the animal: ")
    val animal = sc.next()

    val result = when(animal) { //can also be written as "when(val animal = sc.next()) {}"
        "Dog" -> "Dog is an animal"
        "Cat" -> "Cat is an animal"
        "Lion" -> "Lion is an animal"
        "Cow" -> "Cow is an animal"
        else -> "$animal is not an animal"
    }

    println(result)
}

//NOTE: Can use  range into the When as well.
/*
when(number) {
    1 -> "It is 1"
    2 -> "It is 2"
    in 2..5 -> "Greater than 2 and less than 6"
    6 -> "It is 6"
 */